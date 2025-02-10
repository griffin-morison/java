
public class Point {
    private double myX;
    private double myY;
    private double myZ;
    // Point defaut constructor
    public Point() {
        // this( 0.0, 0.0, 0.0);
        myX = 0.0;
        myY = 0.0;
        myZ = 0.0;
    }
    // Point constructor with specialized input
    public Point(double x, double y, double z) {
        myX = x;
        myY = y;
        myZ = z;
    }
    // Double function to get x value
    public double getX() {
        return myX;
    }
    // Void function to set x value
    public void setX(double x) {
        myX = x;
    }
    // Double function to get y value
    public double getY() {
        return myY;
    }
    // Void function to set y value
    public void setY(double y) {
        myY = y;
    }
    // Double function to get z value
    public double getZ() {
        return myZ;
    }
    // Void function to set z value
    public void setZ(double z) {
        myZ = z;
    }
    // toString function to print Point object
    public String toString() {
        return "(" + myX + "," + myY + "," + myZ + ")";
    }
    // Void function draw Point object
    public void draw() {
        StdDraw.point(myX, myY);
    }
}