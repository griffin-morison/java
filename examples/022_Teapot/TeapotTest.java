// Import java classes for File Input
import java.io.FileInputStream;
// Import java classes for ArrayList
import java.util.ArrayList;
// Import java classes for Scanner
import java.util.Scanner;

public class TeapotTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Create ArrayList of Point objects
        ArrayList<Point> thePoints = new ArrayList<Point>();
		// Create ArrayList of Face objects
        ArrayList<Face> theFaces = new ArrayList<Face>();
		// Create Scanner object
        Scanner theScanner = null;
		// Try block to initialize Scanner object and input file
        try {
		theScanner = new Scanner(
		new FileInputStream( "objectDataComplete" ) );
		}
		// Catch exception to handle exceptions and errors
        catch ( Exception ex ) {
			ex.printStackTrace();
		}
		// While Scanner file has next line
		while( theScanner.hasNextLine() ){
			// String object to store label
            String theLabel = theScanner.next();
			// If label equals 'v' set x,y,z, and p Point values
            if ( theLabel.equals( "v") ){
				double x = theScanner.nextDouble();
				double y = theScanner.nextDouble();
				double z = theScanner.nextDouble();
				Point p = new Point( x, y, z );
				System.out.println( p );
				thePoints.add( p );
			}
			// Else set i,j,k, and f Face values
            else {
				int i = theScanner.nextInt();
				int j = theScanner.nextInt();
				int k = theScanner.nextInt();
				Face f = new Face( thePoints.get(i-1), 
									thePoints.get(j-1), 
									thePoints.get(k-1) ); 
				theFaces.add( f );
				
			}
		}
		// Draw Canvas
        StdDraw.setCanvasSize( 600, 600 );
		StdDraw.setXscale( -4.0 , 4.0 );
		StdDraw.setYscale( -4.0 , 4.0 );
		// For Point objects
        for ( Point p : thePoints ) {
			// Draw Points
            p.draw();
		}
		// For Face objects
        for ( Face f : theFaces ){
			// Draw Faces
            f.draw();
		}
	}
}
