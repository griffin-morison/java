import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FlowLayoutWindow extends JFrame{
	private static final int WIDTH = 300;
	private static final int HEIGHT = 200;
	
	public FlowLayoutWindow()
	{
		super();
		// Set window size
        setSize(WIDTH, HEIGHT);
		// Set window title
        setTitle("FLow Layout WIndow");
		// Set default close operation
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		// FlowLayout l = new FlowLayout();
		// setLayout(l);
		setLayout(new FlowLayout());
		// Create label 1
        JLabel label1 = new JLabel("Label 1");
		// Set label 1 color to red
        label1.setForeground(Color.RED);
		// Add label 1 to window
        add(label1);
		// Create end button to close
        JButton endButton = new JButton("Click to close");
		// Set button color to blue
        endButton.setBackground(Color.BLUE);
		// Set opaque tru
        endButton.setOpaque(true);
		// Add EndingListner to button
        endButton.addActionListener(new EndingListener());
		// Add button to window
        add(endButton);
		// Create label 2
        JLabel label2 = new JLabel("Label 2");
		// Set label 2 color to green
        label2.setForeground(Color.GREEN);
		// Add label 2 to window
        add(label2);
		// Create label 3
        JLabel label3 = new JLabel("Label 3");
		// Set label 3 color to red
        label3.setForeground(Color.RED);
		// Add label 3 to window
        add(label3);
		// Create label 4
        JLabel label4 = new JLabel("Label 4");
		// Set label 4 color to blue
        label4.setForeground(Color.BLUE);
		// Add label 4 to window
        add(label4);
		
	}
	
	private class EndingListener implements ActionListener
	{
        // Action performed listener
        public void actionPerformed(ActionEvent e)
		{
			// Exit
            System.exit(0);
		}
	}
}
