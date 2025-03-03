/*
* Lab 7: Nearest Neighbors
* Filename: Point.java
* Description: This java file creates a Point class utilizing the StdDraw class.
* A Point object will have an X and Y value indicating its position on a Canvas.
* The Point class with get methods for X and Y, along with a draw method and distance
* calculation method.
*/

public class Point {
	// Creates private double variables for X and Y
    private double myX;
	private double myY;
	
	// Constructor for Point object
    public Point(double x, double y) {
		// Sets inputs to X and Y values
        myX = x;
		myY = y;
	}
	// Get method for X
    public double getX() {
		return myX;
	}
	// Get method for Y
    public double getY() {
		return myY;
	}
	// Draw method utilizing StdDraw
    public void draw() {
		StdDraw.point(myX, myY);
	}
	// Double method to calculate distnace of a Point
    public double distance( Point aPoint ){
		// Do the Distance Calculation
		return (Math.sqrt( aPoint.myX - this.myX ) * (aPoint.myX - this.myX) + ( aPoint.myY- this.myY ) * ( aPoint.myY - this.myY));
	}
    // Method to draw a line from this point to another point
    public void drawTo(Point other) {
        StdDraw.line(myX, myY, other.getX(), other.getY());
    }
}