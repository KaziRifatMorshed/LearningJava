package GUI;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class jSliderDemo implements ChangeListener {
    JSlider slider1;
    JFrame frame1;
    JLabel reading;
    JPanel panel1;

    jSliderDemo() {
        frame1 = new JFrame();
        panel1 = new JPanel(new FlowLayout());
        slider1 = new JSlider(0, 100, 90);
        reading = new JLabel();

        frame1.setVisible(true);
//        frame1.setPreferredSize(new Dimension(300, 100)); // WRONG APPROACH
        frame1.setSize(400, 100);
//        frame1.pack(); // er asole kaj ta ki ????
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        slider1.setPreferredSize(new Dimension(250, 50));
        panel1.add(slider1);
        panel1.add(reading);
        frame1.add(panel1);
        panel1.setVisible(true);

        slider1.setPaintTicks(true);
        slider1.setMinorTickSpacing(10);
        slider1.setMajorTickSpacing(20);
        slider1.setPaintLabels(true);
        slider1.addChangeListener(this);
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        reading.setText(STR."Reading: \{slider1.getValue()}");
    }

    public static void main(String[] args) {
        new jSliderDemo();
    }
} // DONE
