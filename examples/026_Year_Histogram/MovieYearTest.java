
public class MovieYearTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Creates new MovieYear object
        MovieYear theMovies = new MovieYear();
        // Loads in text file
		theMovies.loadData("MovieAndYear.txt");
        // Calls prints method which shows the number of movie occurances per year in the text file
		theMovies.printMovieYear();
}
}
