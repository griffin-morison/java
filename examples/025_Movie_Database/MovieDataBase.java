
// Import java library for Scanner, File Input, ArrayList, and Regex
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.regex.*;

public class MovieDataBase {
    // ArrayList containing all actors in movies
    ArrayList<Actor> actorsInMovie = new ArrayList<Actor>();
    // ArrayList containing list of movies
    ArrayList<Movie> listOfMovies = new ArrayList<Movie>();

    // Reads information from file using scanner
    public MovieDataBase() {
        listOfMovies = new ArrayList<>();
        actorsInMovie = new ArrayList<>();
    }

    // Constructor that takes in a Movie ArrayList
    private MovieDataBase(ArrayList<Movie> anArrayList) {
        this.listOfMovies = anArrayList;
        this.actorsInMovie = new ArrayList<>();
    }

    // Get method for specific movie
    public Movie getMovie(int i) {
        return listOfMovies.get(i);
    }

    // Get method for full list of movies
    public ArrayList<Movie> getMovies() {
        return listOfMovies;
    }


    // Loads data from .txt file. Takes a string as a parameter. Returns void.
    public void loadDataFromFile(String aFilename) {
        // String array. Position 0 contains movie. Rest contain actors
        String[] splitMovieAndActor;
        // String array that contains the movie and year in positions 0, 1
        String[] movieElements;

        try (Scanner fileScanner = new Scanner(new FileInputStream(aFilename))) {
            // Loops through lines (movies and actors) of file
            while (fileScanner.hasNextLine()) {
                // Your file parsing logic
                // Placeholder that formats movie to be added to listOfMovies ArrayList
                Movie tempMovie = new Movie();
                // Creates ArrayList to store Actors of a Movie
                ArrayList<Actor> tempActorList = new ArrayList<>();

                // Separate movie from actor(s)
                // Each movie string will be in position 0
                // Each actor string will be in the proceeding positions[1, n]

                // Formats individual file line into a unique string
                String movieFile = fileScanner.nextLine();
                // Splits movies and actors into separate entries
                splitMovieAndActor = movieFile.split("/");

                // Get movie title and year from the first element in the split
                String movieDetails = splitMovieAndActor[0].trim();

                // Regular expression to find the LAST (YYYY) in the string
                Pattern pattern = Pattern.compile("\\((\\d{4})\\)$");
                Matcher matcher = pattern.matcher(movieDetails);

                String movieTitle;
                String yearReleased = "0000"; // Default value if no year is found

                if (matcher.find()) {
                    yearReleased = matcher.group(1); // Extract year
                    movieTitle = movieDetails.substring(0, matcher.start()).trim(); // Remove the year from title
                } else {
                    movieTitle = movieDetails; // Keep full string if no year is found
                }
                
                // Set movie details correctly
                tempMovie.setMovieTitle(movieTitle);
                tempMovie.setYearReleased(yearReleased);

                // Using a for loop, format the actors in splitMovieAndActor
                for (int i = 1; i < (splitMovieAndActor.length); i++) {
                    // Creates an actor to format movie actors with
                    Actor tempActor = new Actor();
                    // Case 1: First and last name
                    if (splitMovieAndActor[i].contains(",")) {
                        // Splits the first and last name
                        String[] actorFirstAndLastName = splitMovieAndActor[i].split(",");
                        tempActor.setLastName(actorFirstAndLastName[0]);
                        tempActor.setFirstName(actorFirstAndLastName[1].substring(1));
                    }
                    // Case 2: Only has first name
                    else {
                        tempActor.setFirstName(splitMovieAndActor[i].substring(1, splitMovieAndActor[i].length()));
                        tempActor.setLastName("");
                    }
                    actorsInMovie.add(tempActor);
                    tempActorList.add(tempActor);
                }
                tempMovie.setActors(tempActorList);
                // Add each movie to a collective ArrayList
                listOfMovies.add(tempMovie);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Finds what actors starred in a movie. Returns an ArrayList of Actor type.
    // Takes a string as a parameter.
    // return an ArrayList of all the actors which star in the specified Movie.
    // public ArrayList<Actor> findActorsIn(String movieName) {
    // ArrayList<Actor> failedTest = new ArrayList<Actor>();
    // for (int i = 0; i < listOfMovies.size(); i++) {
    // if (listOfMovies.get(i).getmovieTitle().equals(movieName)) {
    // System.out.println("Pass");
    // return listOfMovies.get(i).getActor();
    // }
    // }
    // System.out.println("Fail");
    // return failedTest;
    // }

    // Finds actors who starred in a given movie.
    public ArrayList<Actor> findActorsIn(String movieName) {
        for (Movie movie : listOfMovies) {
            if (movie.getMovieTitle().equalsIgnoreCase(movieName)) {
                for (Actor actor : actorsInMovie) {
                    // Return the list of actors in the movie
                    return movie.getActors();
                }
            }
        }
        return new ArrayList<>(); // Return an empty list if no match is found
    }

    // Finds movies that an actor starred in. Returns a MovieDatabase.
    // Takes a string as a parameter.
    // return a new Movie Database containing all movies which star the specified
    // actor.
    public MovieDataBase findMovieAppearancesOf(String actorName) {
        ArrayList<Movie> listToReturn = new ArrayList<>();
        // Trim and make the input case-insensitive
        actorName = actorName.trim().toLowerCase();
        for (Movie movie : listOfMovies) {
            for (Actor actor : movie.getActors()) {
                String temp = (actor.getFirstName() + " " + actor.getLastName()).trim().toLowerCase();
                // System.out.println("   Actor: " + temp);
                if(temp.equals(actorName)) {
                    // System.out.println("Found");
                    listToReturn.add(movie);
                }
            }
        }
        // System.out.println(listToReturn);
        return new MovieDataBase(listToReturn);
    }

    // Finds movies released in a certain year. Takes an integer as a parameter and
    // returns a MovieDatabase
    public MovieDataBase findMoviesReleasedIn(int year) {
        ArrayList<Movie> listToReturn = new ArrayList<Movie>();
        for (int i = 0; i < listOfMovies.size(); i++) {
            if (listOfMovies.get(i).getYearReleased().equals(String.valueOf(year))) {
                listToReturn.add(listOfMovies.get(i));
            }
        }
        // System.out.println(listToReturn);
        MovieDataBase databaseToReturn = new MovieDataBase(listToReturn);
        return databaseToReturn;
    }

    // Finds movies released between two years. Takes two integers as a parameter.
    // Returns a list of movies.

    public MovieDataBase findMoviesReleasedBetween(int startYear, int endYear) {
        ArrayList<Movie> listToReturn = new ArrayList<>();
        for (Movie movie : listOfMovies) {
            try {
                int movieYear = Integer.parseInt(movie.getYearReleased().trim());
                if (movieYear >= startYear && movieYear <= endYear) {
                    listToReturn.add(movie);
                }
            } catch (NumberFormatException e) {
                System.err.println("Skipping invalid year format: " + movie.getYearReleased());
            }
        }
        return new MovieDataBase(listToReturn);
    }

    // Finds movies containing a certain number of actors.Takes a integers as a
    // parameter. Returns movies with specified number of actors.
    public MovieDataBase findMoviesWithNumberActors(int numberOfActors) {
        ArrayList<Movie> listToReturn = new ArrayList<Movie>();
        for (int i = 0; i < listOfMovies.size(); i++) {
            // if (listOfMovies.get(i).getmovieTitle().equals(numberOfActors)) {
            // listToReturn.add(listOfMovies.get(i));
            // }
            if (listOfMovies.get(i).getActors().size() == numberOfActors) {
                listToReturn.add(listOfMovies.get(i));
            }
        }
        MovieDataBase databaseToReturn = new MovieDataBase(listToReturn);
        return databaseToReturn;
    }

    // Finds the oldest movie in the .txt file
    public Movie findOldestMovie() {
        // Return null if no movies exist
        if (listOfMovies.isEmpty()) {
            return null;
        }
        // Assume first movie is the oldest
        Movie oldestMovie = listOfMovies.get(0);
        // For loop to iterate list of movies
        for (Movie movie : listOfMovies) {
            // Stores year released of current movie
            int movieYear = Integer.parseInt(movie.getYearReleased());
            // Stores year release of oldestMovie
            int oldestYear = Integer.parseInt(oldestMovie.getYearReleased());
            // Compares current movie to oldestMovie
            if (movieYear < oldestYear) {
                // Sets oldestMovie to current movie
                oldestMovie = movie;
            }
        }
        return oldestMovie;
    }

    // Finds movies with titles containing a string. Takes a string as a parameter.
    // Returns a MovieDatabase.
    public MovieDataBase findMoviesWithNamesContaining(String word) {
        ArrayList<Movie> listToReturn = new ArrayList<Movie>();
        for (int i = 0; i < listOfMovies.size(); i++) {
            if (listOfMovies.get(i).getMovieTitle().contains(word)) {
                listToReturn.add(listOfMovies.get(i));
            }
        }
        MovieDataBase databaseToReturn = new MovieDataBase(listToReturn);
        return databaseToReturn;
    }

    // Finds actors whose names contain a string. Takes a string as a parameter.
    // Returns an ArrayList of Actor type.
    public ArrayList<Actor> findActorsWithNamesContaining(String word) {
        ArrayList<Actor> listToReturn = new ArrayList<Actor>();
        for (int i = 0; i < listOfMovies.size(); i++) {
            for (int j = 0; j < listOfMovies.get(i).getActors().size(); j++) {
                if (listOfMovies.get(i).getActors().get(j).getFirstName().contains(word)) {
                    listToReturn.add(listOfMovies.get(i).getActors().get(j));
                } else if (listOfMovies.get(i).getActors().get(j).getLastName().contains(word)) {
                    listToReturn.add(listOfMovies.get(i).getActors().get(j));
                }
            }
        }
        return listToReturn;
    }

    // Returns the number of movies or size of a MovieDatabase
    public int size() {
        return listOfMovies.size();
    }

    // toString method
    public String toString() {
        return "" + listOfMovies;
    }
}
