
public class TestDriver {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Creates new MovieDataBase object
        MovieDataBase testData = new MovieDataBase();

        // Loads "cast-mpaa.txt" file
        testData.loadDataFromFile("cast-mpaa.txt");
        // Finds Actors in "Ocean's Eleven"
        System.out.println(testData.findActorsIn("Ocean's Eleven")); // Passed
        // Finds Movies with "Mark (I) Hamill"
        System.out.println(testData.findMovieAppearancesOf("Mark (I) Hamill")); //Passed
        // Finds Movies released in 2000
        System.out.println(testData.findMoviesReleasedIn(2000)); // Passed
        // Finds Movies containing the name "Happy"
        System.out.println(testData.findMoviesWithNamesContaining("Happy")); //Passed
        // Finds Actors with the name "Kevin"
        System.out.println(testData.findActorsWithNamesContaining("Kevin")); // Passed
        // Finds Movies released between 1990 and 1991
        System.out.println(testData.findMoviesReleasedBetween(1990, 1991)); //Passed
        // Finds Movies with 15 Actors
        System.out.println(testData.findMoviesWithNumberActors(15)); //Passed
        // Finds oldest movie in the MovieDataBase
        System.out.println(testData.findOldestMovie()); // Passed
        // Returns the size of the MovieDataBase
        System.out.println(testData.size()); //Passed
    }
}
