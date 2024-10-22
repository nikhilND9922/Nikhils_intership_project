import javax.swing.*;
import java.awt.event.*;

    public class GUI {
        public static void main(String[] args) {
            // Create a magic box (window)
            JFrame magicBox = new JFrame("Welcome App");

            // Put a label (message) inside the magic box
            JLabel label = new JLabel("Press the button to get a surprise!", SwingConstants.CENTER);
            label.setBounds(50, 50, 300, 30);

            // Create a button that you can press
            JButton magicButton = new JButton("Click Me");
            magicButton.setBounds(150, 100, 100, 30);

            // Tell the button what to do when pressed
            magicButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Show the welcome message when you press the button
                    JOptionPane.showMessageDialog(magicBox, "Welcome to the Java GUI Application!");
                }
            });

            // Put everything inside the magic box
            magicBox.add(magicButton);
            magicBox.add(label);

            // Set the size of the magic box
            magicBox.setSize(400, 200);
            magicBox.setLayout(null);
            magicBox.setVisible(true);

            // Close the magic box when you click the close button
            magicBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }


