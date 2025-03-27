import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

public class StringFormater extends JFrame {

    private JTextField inputField;
    private JTextField displayField;

    // Default constructor
    public StringFormater() {
        super();
        // Set window size
        setSize(400, 400);
        // Set default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set title
        setTitle("String Formater");

        // Creates menu listener
        MenuItemListener lis = new MenuItemListener();
        // Creates Menu color object
        JMenu color = new JMenu("Color");
        // Creates Menu alignment object
        JMenu alignment = new JMenu("Alignment");
        // Creates Menu item
        JMenuItem black = new JMenuItem("Black");
        // Add action listener
        black.addActionListener(lis);
        // Add color menu black
        color.add(black);

        // Create menu item red
        JMenuItem red = new JMenuItem("Red");
        // Add action listener
        red.addActionListener(lis);
        // Add color menu red
        color.add(red);

        // Create menu item red
        JMenuItem blue = new JMenuItem("Blue");
        // Add action listener
        blue.addActionListener(lis);
        // Add color menu red
        color.add(blue);

        // Create menu item left
        JMenuItem left = new JMenuItem("Left");
        // Add action listener
        left.addActionListener(lis);
        // Add alignment left
        alignment.add(left);

        // Create menu item right
        JMenuItem right = new JMenuItem("Right");
        // Add action listener
        right.addActionListener(lis);
        // Add alignment right
        alignment.add(right);

        // Create menu item center
        JMenuItem center = new JMenuItem("Center");
        // Add action listener
        center.addActionListener(lis);
        // Add alignment center
        alignment.add(center);

        // Creates menu bar
        JMenuBar menuBar = new JMenuBar();
        // Add colors to menu bar
        menuBar.add(color);
        // Add alignments to menu bar
        menuBar.add(alignment);

        // setMenuBar
        setJMenuBar(menuBar);

        // Creates input panel
        JPanel inputPanel = new JPanel();
        // Add label to input panel
        inputPanel.add(new JLabel("Enter a string: "));
        // Creates input field
        inputField = new JTextField(20);
        // Add input field to panel
        inputPanel.add(inputField);
        // Add input panel with layout north
        add(inputPanel, BorderLayout.NORTH);
        // Creates display field
        displayField = new JTextField(20);
        // Add display field with layout center
        add(displayField, BorderLayout.CENTER);
        // Sets display field to editable
        displayField.setEditable(false);

    }

    public class MenuItemListener implements ActionListener {
        // Action performed method
        public void actionPerformed(ActionEvent e) {
            // Stores command
            String command = e.getActionCommand();
            // Prints command
            System.out.println(command);

            // Add input text to display field
            displayField.setText(inputField.getText());
            // Switch statement for commands
            switch (command) {
                case "Black":
                    displayField.setForeground(Color.BLACK);
                    break;

                case "Red":
                    displayField.setForeground(Color.RED);
                    break;

                case "Blue":
                    displayField.setForeground(Color.BLUE);
                    break;

                case "Left":
                    displayField.setHorizontalAlignment(JTextField.LEFT);
                    break;

                case "Right":
                    displayField.setHorizontalAlignment(JTextField.RIGHT);
                    break;

                case "Center":
                    displayField.setHorizontalAlignment(JTextField.CENTER);
                    break;
                default:
                    System.out.println("Invalid Command");
            }
        }
    }

}
