package GUI;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutManager {

    public static void main(String[] args) {
        MyFrame frame2 = new MyFrame();
        frame2.setLayout(new BorderLayout(10, 10)); // IMPORTANT

        JPanel JPanel1 = new JPanel();
        JPanel JPanel2 = new JPanel();
        JPanel JPanel3 = new JPanel();
        JPanel JPanel4 = new JPanel();
        JPanel JPanel5 = new JPanel();

        JPanel1.setBackground(Color.BLUE);
        JPanel2.setBackground(Color.RED);
        JPanel3.setBackground(Color.GREEN);
        JPanel4.setBackground(Color.magenta);
        JPanel5.setBackground(Color.GRAY);

        JPanel1.setPreferredSize(new Dimension(50, 50)); // IMPORTANT
        JPanel2.setPreferredSize(new Dimension(50, 50));
        JPanel3.setPreferredSize(new Dimension(50, 50));
        JPanel4.setPreferredSize(new Dimension(50, 50));
        JPanel5.setPreferredSize(new Dimension(50, 50));

        frame2.add(JPanel1, BorderLayout.NORTH); // frame er kothay add korbo
        frame2.add(JPanel2, BorderLayout.SOUTH);
        frame2.add(JPanel3, BorderLayout.EAST);
        frame2.add(JPanel4, BorderLayout.WEST);
        frame2.add(JPanel5, BorderLayout.CENTER);

        ///========== SUB PANEL =============================

        JPanel JPanel11 = new JPanel();
        JPanel JPanel22 = new JPanel();
        JPanel JPanel33 = new JPanel();
        JPanel JPanel44 = new JPanel();
        JPanel JPanel55 = new JPanel();

        JPanel11.setBackground(Color.lightGray);
        JPanel22.setBackground(Color.pink);
        JPanel33.setBackground(Color.ORANGE);
        JPanel44.setBackground(Color.cyan);
        JPanel55.setBackground(Color.magenta);

        JPanel11.setPreferredSize(new Dimension(50, 50)); // IMPORTANT
        JPanel22.setPreferredSize(new Dimension(50, 50));
        JPanel33.setPreferredSize(new Dimension(50, 50));
        JPanel44.setPreferredSize(new Dimension(50, 50));
        JPanel55.setPreferredSize(new Dimension(50, 50));


        JPanel5.setLayout(new BorderLayout(4,4)); // MOST IMPORTANT NOW
        JPanel5.add(JPanel11, BorderLayout.NORTH);
        JPanel5.add(JPanel22, BorderLayout.SOUTH);
        JPanel5.add(JPanel33, BorderLayout.EAST);
        JPanel5.add(JPanel44, BorderLayout.WEST);
        JPanel5.add(JPanel55, BorderLayout.CENTER);


    }
}