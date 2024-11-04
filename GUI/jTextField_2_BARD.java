package GUI;
// DOES NOT WORK

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// DOES NOT WORK
public class jTextField_2_BARD extends JFrame implements ActionListener {

    private JTextField usernameField; // Use descriptive names
    private JButton submitButton;

    public jTextField_2_BARD() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        usernameField = new JTextField();
        usernameField.setPreferredSize(new Dimension(250, 30));
        usernameField.setText("Enter your username here..."); // Set default text with light gray color
        usernameField.setForeground(Color.LIGHT_GRAY);
        usernameField.addActionListener(this); // Register listener for text changes

        submitButton = new JButton("Submit"); // Simpler button text
        submitButton.addActionListener(this);

        this.add(usernameField);
        this.add(submitButton);

        this.pack();
        this.setVisible(true);
        this.setSize(400, 200);
    }

// DOES NOT WORK

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object source = actionEvent.getSource();

        if (source == usernameField) {
            String username = usernameField.getText().trim(); // Remove leading/trailing whitespace
            if (username.isEmpty()) {
                usernameField.setText("Enter your username here...");
                usernameField.setForeground(Color.LIGHT_GRAY);
            } else {
                usernameField.setText(username); // Keep entered username
                usernameField.setForeground(Color.BLACK);
            }
        } else if (source == submitButton) {
            String username = usernameField.getText().trim();
            if (!username.isEmpty()) {
                System.out.println(STR."Welcome, \{username}!");
            }
        }
    }

    public static void main(String[] args) {
        new jTextField_2_BARD();
    }
} // DOES NOT WORK


