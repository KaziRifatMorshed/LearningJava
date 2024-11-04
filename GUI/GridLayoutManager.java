package GUI;

import javax.swing.*;
import java.awt.*;

public class GridLayoutManager {
    public static void main(String[] args) {
        MyFrame frame1 = new MyFrame();
        frame1.setLayout(new GridLayout(4, 3,3,3));

        frame1.add(new JButton("1"));
        frame1.add(new JButton("2"));
        frame1.add(new JButton("3"));
        frame1.add(new JButton("4"));
        frame1.add(new JButton("5"));
        frame1.add(new JButton("6"));
        frame1.add(new JButton("7"));
        frame1.add(new JButton("8"));
        frame1.add(new JButton("9"));

    }
}
