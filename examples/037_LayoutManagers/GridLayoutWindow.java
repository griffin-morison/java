import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GridLayoutWindow extends JFrame {
	// Variables for grid side, rows, and columns
    private static int SIDE = 200;
	private static int ROWS = 3;
	private static int COLS = 3;
	
	public GridLayoutWindow()
	{
		super();
		// Set window size
        setSize(SIDE, SIDE);
		// Set window title
        setTitle("Grid Layout Window");
		// Set default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set layout
        setLayout(new GridLayout(ROWS, COLS));
		// Create button listner
        MyButtonListener buttonListener = new MyButtonListener();
		// For loop to iterate rows and columns
        for(int i = 1; i <= ROWS* COLS; i++)
		{
			// Variable to store string text
            String text = Integer.toString(i);
			// Creates new button
            JButton b = new JButton(text);
			// Add action listener to button
            b.addActionListener(buttonListener);
			// Add button
            add(b);
		}
	}

	private class MyButtonListener implements ActionListener
	{
		// Action performed listener
        public void actionPerformed(ActionEvent e)
		{
            // Print action command 
            System.out.println(e.getActionCommand());
			// Button get source call
            JButton b = (JButton) e.getSource();
			// Set button background color to yellow
            b.setBackground(Color.YELLOW);
			// Set opaque true
            b.setOpaque(true);
			
		}
	}
}
