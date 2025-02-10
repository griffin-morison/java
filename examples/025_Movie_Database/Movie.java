import java.util.ArrayList;

public class Movie {
    private String movieTitle = "";
    private String yearReleased = "";
    private ArrayList<Actor> listOfActors = new ArrayList<Actor>();

    /**
     * General Movie Constructor
     * 
     * @param movie
     * @param year
     */
    public Movie(String nameToSet, String yearToSet) {
        this.movieTitle = nameToSet;
        this.yearReleased = yearToSet;
        this.listOfActors = new ArrayList<>();
    }

    public Movie() {
        movieTitle = "";
        yearReleased = "";
        listOfActors = new ArrayList<Actor>();

    }

    // Getters and Setters
    // Set method for movie title
    public void setMovieTitle(String nameToSet) {
        this.movieTitle = nameToSet;
    }
    // Get method for movie title
    public String getMovieTitle() {
        return this.movieTitle;
    }
    // Set method for year released
    public void setYearReleased(String yearToSet) {
        this.yearReleased = yearToSet;
    }
    // Get method for year released
    public String getYearReleased() {
        return this.yearReleased;
    }
    // Set method for actor ArrayList
    public void setActors(ArrayList<Actor> actors) {
        this.listOfActors = new ArrayList<>(actors);
    }
    // Get method for actor ArrayList
    public ArrayList<Actor> getActors() {
        return new ArrayList<>(this.listOfActors);
    }

    // toString() method
    public String toString() {
        return movieTitle + " (" + yearReleased + ")";
    }
}
