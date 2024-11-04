package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickMe_ThankYou extends JFrame implements ActionListener {
    JFrame frame1 = null;
    JPanel panel1;
    JButton button1 = null;

    public ClickMe_ThankYou() {
        frame1 = new JFrame();
        frame1.setVisible(true);
        frame1.setSize(400, 200);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button1 = new JButton("Click Me !!!");
        button1.addActionListener(this);

        panel1 = new JPanel();
        panel1.add(button1);
        frame1.add(panel1);

    }


    public static void main(String[] args) {
        new ClickMe_ThankYou();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == button1) {
            JOptionPane.showMessageDialog(null, "Thank You");
        }
    }
} // DONE