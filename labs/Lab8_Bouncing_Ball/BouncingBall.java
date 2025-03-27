import java.awt.Color;
import java.util.Random;

public class BouncingBall {
    // Private class variable
	private static final int RADIUS = 20;
	private Color color;
	private double xCoord, yCoord;
	private double xVel, yVel;
	private int canvasSize;
	private Random rand = new Random();
	
	// Parameterized constructor
    public BouncingBall(double x, double y, double vx, double vy, int size)
	{
		xCoord = x;
		yCoord = y;
		xVel = vx;
		yVel = vy;
		canvasSize = size;
		color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
	}
	
	// Draw method
    public void draw()
	{
		// Set pen color
        StdDraw.setPenColor(color);
		// Draw filled circle
        StdDraw.filledCircle(xCoord, yCoord, RADIUS);
	}
	
    // Move method
	public void move()
	{
		// Increment x and y coordinates
        xCoord += xVel;
		yCoord += yVel;
		// Edge case to contain x coordinates within canvas
        if (xCoord < 0 || xCoord > canvasSize)
		{
			// Change x velocity
            xVel *= -1;
			// Change color
            color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
		}
		// Edge case to contain y coordinates within canvas
        if (yCoord < 0 || yCoord > canvasSize)
		{
			// Change y velocity
            yVel *= -1;
			// Change color
            color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
		}
	}
}

