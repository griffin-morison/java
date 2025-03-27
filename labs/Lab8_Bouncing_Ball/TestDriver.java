public class TestDriver {
	// Set canvas size variable
    public static final int CANVAS_SIZE = 400;
	// Set max velocity variable 
    public static final int MAX_VELOCITY = 5;
	public static void main(String[] args) {
		// Draw canvas
        StdDraw.setCanvasSize(CANVAS_SIZE, CANVAS_SIZE);
		// Set x scale
        StdDraw.setXscale(0, CANVAS_SIZE);
		// Set y scale
        StdDraw.setYscale(0, CANVAS_SIZE);
	
		// Create BouncingBall object
		BouncingBall ball = new BouncingBall(200, 100, 1, 2, CANVAS_SIZE);
		// While true
        while (true)
		{
			// Clear canvas
            StdDraw.clear();
			// Move ball
            ball.move();
			// Draw ball
            ball.draw();
			// Show
            StdDraw.show(20);
		}
	}
}


