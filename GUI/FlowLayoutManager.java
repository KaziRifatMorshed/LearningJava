package GUI;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutManager {

    public static void main(String[] args) {
        MyFrame frame1 = new MyFrame();
        frame1.setLayout(new FlowLayout(FlowLayout.LEADING, 9, 5));

        JPanel panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(150, 250)); // REMEMBER
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));
        panel1.setBackground(Color.lightGray);

        panel1.add(new JButton("1"));
        panel1.add(new JButton("2"));
        panel1.add(new JButton("3"));
        panel1.add(new JButton("4"));
        panel1.add(new JButton("5"));
        panel1.add(new JButton("6"));
        panel1.add(new JButton("9"));
        panel1.add(new JButton("7"));
        panel1.add(new JButton("8"));

        frame1.add(panel1);
    }
}
