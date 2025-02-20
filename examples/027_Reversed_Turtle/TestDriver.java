
public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sets canvas size
        StdDraw.setCanvasSize( 400, 400 );
		// Sets x scale
        StdDraw.setXscale( -10.0, 10 );
		// Sets y scale
        StdDraw.setYscale( -10.0, 10 );
		
        // Creates Turtle object named bob
        Turtle bob = new Turtle();
		// Moves bob a direction
        bob.backward();
		bob.backward();
		bob.turnRight();
		bob.backward();
		bob.backward();
		bob.turnLeft();
		bob.backward();
		bob.backward();
        
		
		// Creates a ReversedTurtle object named john
		ReversedTurtle john = new ReversedTurtle();
		// Move john a direction
        john.backward();
		john.backward();
		john.turnRight();
		john.backward();
		john.backward();
		john.turnLeft();
		john.backward();
		john.backward();
		
		// Shows drawing 
        StdDraw.show();
	}

}
