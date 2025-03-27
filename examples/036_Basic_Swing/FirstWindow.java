import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class FirstWindow extends JFrame {
	private static final int WIDTH = 300;
	private static final int HEIGHT = 200;
	
	// Default constructor
    public FirstWindow()
	{
		super();
		// Set window size
        setSize(WIDTH, HEIGHT);
		// Set window title
        setTitle("First Window Class");
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		JButton endButton = new JButton("Click to close application");
		// Register the listener with the component
		endButton.addActionListener(new EndingListener());
		// add(endButton);
		add(endButton, BorderLayout.SOUTH);
		getContentPane().setBackground(Color.RED);
	}
	
	// inner class for listener
	private class EndingListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}
	
	
}
