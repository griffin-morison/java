import java.util.ArrayList;

public class MovieTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Create Movie object 'testMovie'
        Movie testMovie = new Movie();
        // Set Movie title to "Around the World Under the Sea"
        testMovie.setMovieTitle("Around the World Under the Sea");
        // Set Movie release year to "1966"
        testMovie.setYearReleased("1966");

        // Print 'testMovie' title
        System.out.println(testMovie.getMovieTitle());
        // Print 'testMovie' year released
        System.out.println(testMovie.getYearReleased());

        ArrayList<Actor> testActors = new ArrayList<Actor>();
        
        Actor var1 = new Actor();
        var1.setfirstName("Griff");
        var1.setlastName("Henderson");
        testActors.add(var1);

        testMovie.setActors(testActors);
        System.out.println(testMovie.getActors());

    }

}
