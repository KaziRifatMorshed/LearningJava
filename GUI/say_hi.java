package GUI;

import javax.swing.*;

public class say_hi extends JFrame {
    private JButton okDoneButton;
    private JButton cancelButton;
    private JPanel MainPanel;

    say_hi() {
        this.setTitle("Halua");
        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(MainPanel);
    }

    public static void main(String[] args) {
        new say_hi();
    }
}
