
public class TestDriver {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Creates new MovieDataBase object
        MovieDataBase testData = new MovieDataBase();

        // Loads "cast-mpaa.txt" file
        testData.loadDataFromFile("cast-mpaa.txt");
        // Finds Actors in "Ocean's Eleven"
        System.out.println(testData.findActorsIn("Ocean's Eleven"));
        // // Finds Movies with "Kevin Bacon"
        // testData.findMovieAppearancesOf("Kevin Bacon");
        // // Finds Movies released in 2000
        // testData.findMoviesReleasedIn(2000);
        // // Finds Movies containing the name "Happy"
        // testData.findMoviesWithNamesContaining("Happy");
        // // Finds Actors with the name "Kevin"
        // testData.findActorsWithNamesContaining("Kevin");
        // // Finds Movies released between 1990 and 1991
        // testData.findMoviesReleasedBetween(1990, 1991);
        // // Finds Movies with 15 Actors
        // testData.findMoviesWithNumberActors(15);
        // Returns the size of the MovieDataBase
        testData.size();
    }

}
