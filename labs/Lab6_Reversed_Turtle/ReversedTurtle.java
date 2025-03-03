
public class ReversedTurtle {
    // Private variables for direction, x, y, and penDown
    private String myDirection;
    private double myX;
    private double myY;
    private boolean penDown;

    // Default constructor
    public ReversedTurtle() {
        // ReversedTurtle direction set to 'North'; (2,2); penDown
        this("North", -2.0, 0.0, true);
    }

    // Constructor method that takes input for direction, x, y, and penDown
    public ReversedTurtle(String dir, double x, double y, boolean pen) {
        myX = x;
        myY = y;
        myDirection = dir;
        penDown = pen;
    }

    // Get method to return boolean value if penDown or Up
    public boolean getPen() {
        return penDown;
    }

    // Set method to set penDown or Up
    public void setPen(boolean value) {
        penDown = value;
    }

    // Void method to change director to left
    public void turnLeft() {
        // Switch block
        switch (myDirection) {
            // If current direction change to new direction
            case "North":
                myDirection = "West";
                break;
            case "West":
                myDirection = "South";
                break;
            case "South":
                myDirection = "East";
                break;
            case "East":
                myDirection = "North";
                break;
            // Default if case doesn't match
            default:
                System.out.println("Illegal Direction");
        }
    }
    // Void method to change director to right
    public void turnRight() {
        // Switch block
        switch (myDirection) {
            // If current direction change to new direction
            case "North":
                myDirection = "East";
                break;
            case "West":
                myDirection = "North";
                break;
            case "South":
                myDirection = "West";
                break;
            case "East":
                myDirection = "South";
                break;
            // Default if case doesn't match
            default:
                System.out.println("Illegal Direction");
        }
    }

    // Void method to move foward
    public void forward() {
        double currentX = myX;
        double currentY = myY;
        // Switch block
        switch (myDirection) {
            // If current direction change modify x or y value
            case "North":
                myY--;
                break;
            case "West":
                myX++;
                break;
            case "South":
                myY++;
                break;
            case "East":
                myX--;
                break;
            // Default if case doesn't match
            default:
                System.out.println("Illegal Direction");
        }
        // If penDown
        if (penDown) {
            // Draw a line
            StdDraw.line(currentX, currentY, myX, myY);
        }
    }

    // Void method to move backward
    public void backward() {
        double currentX = myX;
        double currentY = myY;
        // Switch block
        switch (myDirection) {
            // If current direction change modify x or y value
            case "North":
                myY++;
                break;
            case "West":
                myX--;
                break;
            case "South":
                myY--;
                break;
            case "East":
                myX++;
                break;
            // Default if case doesn't match
            default:
                System.out.println("Illegal Direction");
        }
        // If penDown
        if (penDown) {
            // Draw a line
            StdDraw.line(currentX, currentY, myX, myY);
        }
    }
    
    // Void method for using a sequence of commands
    public void commands(String seq) {
        // For loop to iterate the sequence length
        for (int i = 0; i < seq.length(); i++) {
            // Switch block
            switch (seq.charAt(i)) {
                // If sequence command is this move ReversedTurtle object
                case 'F':
                    this.forward();
                    break;
                case 'R':
                    this.turnLeft();
                    break;
                case 'L':
                    this.turnRight();
                    break;
                case 'U':
                    this.penDown = false;
                    break;
                case 'D':
                    this.penDown = true;
                    break;
                // Default if case doesn't match
                default:
                    System.out.println("Illegal Command");
            }
        }
    }
    // Get method to return current direction of Turtle
    public String getMyDirection() {
        return myDirection;
    }

    // Set method to modify current direction of Turtle
    public void setMyDirection(String myDirection) {
        this.myDirection = myDirection;
    }

    // Get method to return current x position
    public double getMyX() {
        return myX;
    }

    // Set method to modify x position
    public void setMyX(double myX) {
        this.myX = myX;
    }

    // Get method to return current y position
    public double getMyY() {
        return myY;
    }

    // Set method to modify y position
    public void setMyY(double myY) {
        this.myY = myY;
    }

    // Boolean method to set penDown
    public boolean isPenDown() {
        return penDown;
    }

    // Set method to modify boolean to penDown
    public void setPenDown(boolean penDown) {
        this.penDown = penDown;
    }

}
