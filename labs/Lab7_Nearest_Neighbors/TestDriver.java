/*
* Lab 7: Nearest Neighbors
* Filename: TestDriver.java
* Description: This java file demonstrates a Test Driver file to test the Point class
* and StdDraw class. In this test 10 Point objects will be generated at random and added
* to an ArrayList. The Point objects will then be drawn on a 600 x 600 canvas the nearest
* neighbor Point objects will be calculated and drawn.
*/

// imports java ArrayList utility
import java.util.ArrayList;

public class TestDriver {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Create 10 Random Points and put them in a list
        ArrayList<Point> thePoints = new ArrayList<Point>();
        // For loop to create 10 point objects
        for (int i = 0; i < 10; i++) {
            Point p = new Point(600 * Math.random(), 600 * Math.random());
            // Adds Point object to ArrayList
            thePoints.add(p);
        }
        // Sets Canvas Size to 600 x 600
        StdDraw.setCanvasSize(600, 600);
        // Sets X scale to 0 - 600
        StdDraw.setXscale(0.0, 600.0);
        // Sets Y scale to 0 - 600
        StdDraw.setYscale(0.0, 600.0);
        // Draw the Points in the List
        for (Point p : thePoints) {
            p.draw();
        }
        // Draw lines to nearest neighbors
        for (Point p : thePoints) {
            Point nearest = findNearest(p, thePoints);
            if (nearest != null) {
                p.drawTo(nearest);
            }
        }
        // Draw lines to the nearestNeighbors
        StdDraw.show();
    }

    // Point method to find and calculate nearest Point
    public static Point findNearest(Point aPoint, ArrayList<Point> theList) {
		// Create null Point object
        Point nearest = null;
		// Set minDistance equal to double max value
        double minDistance = Double.MAX_VALUE;
        // For loop to iterate Points in ArrayList
        for( Point p : theList ) {
		    // If Point p doesn't equal aPoint
            if(!p.equals(aPoint)) {
                // Create variable to store distance from aPoint to p
                double distance = aPoint.distance(p);
                // If distance is less than minDistance 
                if(distance < minDistance) {
                    // Set minDistance equal to distance
                    minDistance = distance;
                    // Set nearest equal to p
                    nearest = p;
                }
		    }
	    }
        return nearest;
    }
}