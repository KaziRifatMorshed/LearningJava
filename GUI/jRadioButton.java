package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jRadioButton implements ActionListener {
    MyFrame frame1;
    JRadioButton p, b, r;

    public jRadioButton() {
        frame1 = new MyFrame();
        frame1.pack();
        frame1.setLayout(new FlowLayout());
        frame1.setSize(200, 50); //  kaj kore na keno ?????
        p = new JRadioButton("Pizza");
        b = new JRadioButton("burger");
        r = new JRadioButton("Rice");

        ButtonGroup BGroup1 = new ButtonGroup();
        BGroup1.add(p);
        BGroup1.add(b);
        BGroup1.add(r);

        p.addActionListener(this);
        b.addActionListener(this);
        r.addActionListener(this);

//        frame1.add(BGroup1); // WRONG
        frame1.add(b);
        frame1.add(r);
        frame1.add(p);

//         personRadioButton.setSelected(true); // Yah



    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == p) {
            System.out.println("Hey Pizza man");
        }
        if (actionEvent.getSource() == b) {
            System.out.println("Burger lover");
        }
        if (actionEvent.getSource() == r) {
            System.out.println("Yummy Fried Rice");
        }
    }

    public static void main(String[] args) {
        new jRadioButton();
    }
} // done
