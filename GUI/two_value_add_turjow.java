package GUI;

import javax.swing.*;
import java.awt.*;

public class two_value_add_turjow extends JFrame {
    public two_value_add_turjow() {
        this.setTitle("yayy");
        this.setSize(500, 350);

        this.setLayout(new FlowLayout());
        JLabel label = new JLabel("value 1: ");
        JPanel panel = new JPanel();
        panel.add(label);

        JTextField field = new JTextField(20);
        panel.add(field);

        JLabel label2 = new JLabel("value 2: ");
        JTextField field2 = new JTextField(20);
        JPanel panel2 = new JPanel();
        panel2.add(label2);
        panel2.add(field2);

        JLabel label3 = new JLabel("result");
        JTextField result = new JTextField(20);
        JPanel panel3 = new JPanel();
        panel3.add(label3);
        panel3.add(result);

        JButton btn = new JButton("ADD");
        JPanel panel4 = new JPanel();
        panel4.add(btn);

        btn.addActionListener(e -> {
            int a = Integer.parseInt(field.getText());
            int b = Integer.parseInt(field2.getText());
            result.setText(String.valueOf(a + b));
        });


        this.getContentPane().add(panel);
        this.getContentPane().add(panel2);
        this.getContentPane().add(panel3);
        this.getContentPane().add(panel4);

        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new two_value_add_turjow();
    }
}
