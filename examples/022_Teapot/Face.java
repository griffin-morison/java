
public class Face {
    private Point p1;
    private Point p2;
    private Point p3;
    // Face constructor
    public Face(Point a, Point b, Point c) {
        p1 = a;
        p2 = b;
        p3 = c;
    }
    // Void function to draw Face object
    public void draw() {
        StdDraw.line(p1.getX(), p1.getY(), p2.getX(), p2.getY());
        StdDraw.line(p1.getX(), p1.getY(), p3.getX(), p3.getY());
        StdDraw.line(p2.getX(), p2.getY(), p3.getX(), p3.getY());
    }
}
