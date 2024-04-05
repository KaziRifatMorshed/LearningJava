package GUI;

import javax.swing.*;
import java.awt.*;

public class JPanel_1 {
    public static void main(String[] args) {
        ImageIcon img1 = new ImageIcon("/mnt/GitHub/LearningJava/GUI/linus-torvalds-nvidia.jpg");
        // ImageIcon img1 = new ImageIcon("linus-torvalds-nvidia.jpg"); // DOES NOT WORK
        JLabel label1 = new JLabel();
        label1.setText("Hell World");
        label1.setIcon(img1);
        // label1.setBounds(0,0,75,75);


        JPanel red_panel = new JPanel();
        red_panel.setBackground(Color.RED);
        red_panel.setBounds(0, 0, 250, 250);

        JPanel blue_panel = new JPanel();
        blue_panel.setBackground(Color.blue);
        blue_panel.setBounds(250, 0, 250, 250);

        JPanel green_panel = new JPanel();
        green_panel.setBackground(Color.green);
        green_panel.setBounds(0, 250, 250 * 2, 250);
        green_panel.setLayout(new BorderLayout());
        green_panel.add(label1);
        // label1.setHorizontalAlignment(JLabel.RIGHT);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setVerticalAlignment(JLabel.CENTER);

        JFrame frame1 = new JFrame();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(null);
        frame1.setSize(750, 750);
        frame1.setVisible(true);
        frame1.add(red_panel);
        frame1.add(blue_panel);
        frame1.add(green_panel);


    }


}
