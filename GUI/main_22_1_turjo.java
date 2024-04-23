package GUI;

import javax.swing.*;
import java.awt.*;


public class main_22_1_turjo extends JFrame {
    public main_22_1_turjo() {
        this.setTitle("yayy");
        this.setSize(250, 120);

        JButton btn = new JButton("click me");

        btn.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Arigatto");
        });

        this.setLayout(new FlowLayout());

        this.getContentPane().add(btn);

        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new main_22_1_turjo();
    }
}
