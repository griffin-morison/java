
// Import java library for Scanner, File Input, and ArrayList
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.ArrayList;

public class MovieDataBase {
    // ArrayList containing all movies
    ArrayList<Movie> MovieArrayList;
    // ArrayList containing all actors in movies
    ArrayList<Actor> actorsInMovie = new ArrayList<Actor>();
    // ArrayList containing list of movies
    ArrayList<Movie> listOfMovies = new ArrayList<Movie>();

    // Reads information from file using scanner
    public MovieDataBase() {
        MovieArrayList = new ArrayList<Movie>();
    }

    // Constructor that takes in a Movie ArrayList
    private MovieDataBase(ArrayList<Movie> anArrayList) {
        MovieArrayList = anArrayList;
    }

    // Get method for Movie object in
    public Movie getMovie(int i) {
        return listOfMovies.get(i);
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
                Movie tempMovie = new Movie(); // Placeholder that formats movie to be added to listOfMovies ArrayList
                // Separate movie from actor(s)
                // Each movie string will be in position 0
                // Each actor string will be in the proceeding positions[1, n]
            
                // Formats individual file line into a unique string
                String movieFile = fileScanner.nextLine(); 
                // Splits movies and actors into separate entries
                splitMovieAndActor = movieFile.split("/");
            
                // Using position 0 in splitMovieAndActor, format the movie to type Movie
                // Formats movie and year into separate entries
                movieElements = splitMovieAndActor[0].split("\\("); 
            
                // Extract movie title correctly
                tempMovie.setMovieTitle(movieElements[0].trim());
                // Extract and clean up the year (removes closing parenthesis)
                tempMovie.setYearReleased(movieElements[1].replace(")", "").trim());

                // Using a for loop, format the actors in splitMovieAndActor
                for (int i = 1; i < (splitMovieAndActor.length); i++) {
                    // Creates an actor to format movie actors with
                    Actor tempActor = new Actor(); 
                    // Case 1: First and last name
                    if (splitMovieAndActor[i].contains(",")){
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
                }
                tempMovie.setActors(actorsInMovie);
                // Add each movie to a collective ArrayList
                listOfMovies.add(tempMovie);
            }
        } 
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Finds what actors starred in a movie. Returns an ArrayList of Actor type.
    // Takes a string as a parameter.
    // return an ArrayList of all the actors which star in the specified Movie.
    // public ArrayList<Actor> findActorsIn(String movieName) {
    //     ArrayList<Actor> failedTest = new ArrayList<Actor>();
    //     for (int i = 0; i < listOfMovies.size(); i++) {
    //         if (listOfMovies.get(i).getmovieTitle().equals(movieName)) {
    //             System.out.println("Pass");
    //             return listOfMovies.get(i).getActor();
    //         }
    //     }
    //     System.out.println("Fail");
    //     return failedTest;
    // }

    // Finds actors who starred in a given movie.
    public ArrayList<Actor> findActorsIn(String movieName) {
        for (Movie movie : listOfMovies) {
            if (movie.getMovieTitle().equalsIgnoreCase(movieName)) {
                return movie.getActors(); // Return the list of actors in the movie
            }
        }
        return new ArrayList<>(); // Return an empty list if no match is found
    }


    // Finds movies that an actor starred in. Returns a MovieDatabase.
    // Takes a string as a parameter.
    // return a new Movie Database containing all movies which star the specified
    // actor.
    public MovieDataBase findMovieAppearancesOf(String actorName) {
        ArrayList<Movie> listToReturn = new ArrayList<Movie>();
        actorName = actorName.replace(" ", "");
        for (int i = 0; i < listOfMovies.size(); i++) {
            for (int j = 0; j < listOfMovies.get(i).getActors().size(); j++) {
                if (listOfMovies.get(i).getActors().get(j).equals(actorName)) {
                listToReturn.add(listOfMovies.get(i));
                }
            }
        }
        MovieDataBase databaseToReturn = new MovieDataBase(listToReturn);
        return databaseToReturn;
    }

    // Finds movies released in a certain year. Takes an integer as a parameter and
    // returns a MovieDatabase
    public MovieDataBase findMoviesReleasedIn(int year) {
        ArrayList<Movie> listToReturn = new ArrayList<Movie>();
        for (int i = 0; i < listOfMovies.size(); i++) {
            // if (listOfMovies.get(i).getmovieTitle().substring(1,
            // listOfMovies.get(i).getmovieTitle().length() - 1)
            // .equals(Integer.toString(year))) {
            // listToReturn.add(listOfMovies.get(i));
            // }
            if (listOfMovies.get(i).getYearReleased().equals(String.valueOf(year))) {
                listToReturn.add(listOfMovies.get(i));
            }

        }
        System.out.println(listToReturn);
        MovieDataBase databaseToReturn = new MovieDataBase(listToReturn);
        return databaseToReturn;
    }

    // Finds movies released between two years. Takes two integers as a parameter.
    // Returns a list of movies.
    public MovieDataBase findMoviesReleasedBetween(int startYear, int endYear) {
        ArrayList<Movie> listToReturn = new ArrayList<Movie>();
        for (int i = 0; i < listOfMovies.size(); i++) {
            // if ((listOfMovies.get(i).getmovieTitle().substring(1,
            // listOfMovies.get(i).getmovieTitle().length() - 1)
            // .equals(i >= startYear && i <= endYear))) {

            // listToReturn.add(listOfMovies.get(i));
            // }
            int movieYear = Integer.parseInt(listOfMovies.get(i).getYearReleased());
            if (movieYear >= startYear && movieYear <= endYear) {
                listToReturn.add(listOfMovies.get(i));
            }
        }
        System.out.println(listToReturn);
        MovieDataBase databaseToReturn = new MovieDataBase(listToReturn);
        return databaseToReturn;
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

    /*
     * Finds the oldest movie in the .txt file
     */
    // public MovieDataBase findOldestMovie() {
    // ArrayList<Movie> listToReturn = new ArrayList<Movie>();
    // for (int i = 0; i > 2010; i++) {

    // }
    // }

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

    // Get method to return movies in a MovieDataBase
    public ArrayList<Movie> getMovieList(MovieDataBase aDatabase) {
        return aDatabase.MovieArrayList;
    }
}
