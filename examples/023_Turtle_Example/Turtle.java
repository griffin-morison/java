
public class Turtle {
    // direction 0 is "North"
    // direction 1 is "East"
    // direction 2 is "South"
    // direction 3 is "West"
    private int myDirection;
    private double myX;
    private double myY;
    private boolean penDown;

    // Default Turtle constructor
    public Turtle() {
        this(0, 0.0, 0.0, true);
    }
    // Turtle constructor with specified inputs
    public Turtle(int dir, double x, double y, boolean pen) {
        myDirection = dir;
        myX = x;
        myY = y;
        penDown = pen;
    }
    // Boolean function to get penDown
    public boolean getPen() {
        return penDown;
    }
    // Void function to set penDown
    public void setPen(boolean pen) {
        penDown = pen;
    }
    // Void function to input move commands
    public void commands(String aCommand) {
        // For loop to iterate the length of command
        for (int i = 0; i < aCommand.length(); i++) {
            // Switch case
            switch (aCommand.charAt(i)) {
                // If 'F' move foward
                case 'F':
                    this.forward();
                    break;
                // If 'R' turn right
                case 'R':
                    this.turnRight();
                    break;
                // If 'L' turn left
                case 'L':
                    this.turnLeft();
                    break;
                // If 'U' penUp
                case 'U':
                    this.setPen(false);
                    break;
                // If 'D' penDown
                case 'D':
                    this.setPen(true);
                    break;
                // Else print "Illegal Command"
                default:
                    System.out.println("Illegal Command");
            }
        }
    }
    // Void function to move forward
    public void forward() {
        double x = myX;
        double y = myY;
        switch (myDirection) {
            // North 
            case 0:
                myY--;
                break;
            // East
            case 1:
                myX++;
                break;
            // South
            case 2:
                myY++;
                break;
            // West
            case 3:
                myX--;
                break;
            default:
                System.out.println("Illegal Direction");
        }
        if (penDown) {
            StdDraw.line(myX, myY, x, y);
        }
    }
    // Void funtion to turn left
    public void turnLeft() {
        myDirection--;
        if (myDirection < 0) {
            myDirection = 3;
        }
    }
    // Void funtion to turn right
    public void turnRight() {
        myDirection++;
        if (myDirection > 3) {
            myDirection = 0;
        }
    }
}
