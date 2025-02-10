
public class TestTurtle {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        // Draw Canvas
        StdDraw.setCanvasSize(400, 400);
        StdDraw.setXscale(-10.0, 10);
        StdDraw.setYscale(-10.0, 10);
        
        // Create Turtle object bob
        Turtle bob = new Turtle();
        
        // Move bob forward "South x2"
        bob.forward();
        bob.forward();
        // Turn right "East"
        bob.turnRight();
        // Move bob forward "East x2"
        bob.forward();
        bob.forward();
        // Move commands for bob
        // "East x2" "South x2" "East x2" "South x2"
        bob.commands("FFRFFLFFRFFL");
    }

}
