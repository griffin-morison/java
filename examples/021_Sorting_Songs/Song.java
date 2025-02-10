
public class Song {
    // Private class variables
    private String Title;
    private String Artist;
    private int Rating;

    // Constructor method
    public Song(String name, String author, int rate) {
        Title = name;
        Artist = author;
        Rating = rate;
    }

    // Boolean function to compare Song objects
    public boolean compareTo(Song a) {
        // If Song rating is less than compared Song rating
        if (Rating < (a.Rating)) {
            return true;
        }
        // If Song artist is less than 0
        if (Artist.compareTo(a.Artist) < 0) {
            return true;
        }
        return false;
    }

    // toString function to print Song
    String toSting() {
        return Title + " " + Artist + " " + Rating;
    }
}
