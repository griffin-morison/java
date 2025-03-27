import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;

public class BorderLayoutWindow extends JFrame {
	private static final int WIDTH = 300;
	private static final int HEIGHT = 200;
	
	// Default constructor
    public BorderLayoutWindow()
	{
		super();
		// Set window size
        setSize(WIDTH, HEIGHT);
		// Set window title
        setTitle("Border Layout Window");
		// Set default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout()); //optional default for JFrame
		
		// Create center label
        JLabel center = new JLabel("Center", JLabel.CENTER);
		// Sets background to red
        center.setBackground(Color.RED);
		// Opaque is true
        center.setOpaque(true);
		// Add to window
        add(center, BorderLayout.CENTER);
		
		// Create east label
        JLabel east = new JLabel("East", JLabel.CENTER);
		// Sets background to Green
        east.setBackground(Color.GREEN);
		// Opaque is true
        east.setOpaque(true);
		// Add to window
        add(east, BorderLayout.EAST);
		
		// Create north label
        JLabel north = new JLabel("North", JLabel.CENTER);
		// Sets background to yellow
        north.setBackground(Color.YELLOW);
		// Opaque is true
        north.setOpaque(true);
		// Add to window
        add(north, BorderLayout.NORTH);
		
		// Create west label
        JLabel west = new JLabel("West", JLabel.CENTER);
		// Sets background to blue
        west.setBackground(Color.BLUE);
		// Opaque is true
        west.setOpaque(true);
		// Add to window
        add(west, BorderLayout.WEST);
		
		// Create button panel
        JPanel buttonPanel = new JPanel();
		// Sets button background to yellow
        buttonPanel.setBackground(Color.YELLOW);
		// Create ok button
        JButton ok = new JButton("OK");
		// Add button to panel
        buttonPanel.add(ok);
		// Create cancel button
        JButton cancel = new JButton("Cancel");
		// Add button to panel
        buttonPanel.add(cancel);
		// Add panel to window
        add(buttonPanel, BorderLayout.SOUTH);
	}
}
