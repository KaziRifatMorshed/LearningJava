package GUI;

import javax.swing.*;
 // SEAM
public class main_22_1 {
    JFrame frame = new JFrame("Frame");
    JPanel panel = new JPanel();
    JButton button = new JButton("Click Me!");


    public main_22_1() {
        frame.setSize(400, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.add(button);
        frame.add(panel);

        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (e.getSource() == button) {
                    JOptionPane.showMessageDialog(null, "hehe");
                }
            }
        });
    }

    public static void main(String[] args) {
        new main_22_1();
    }
}

