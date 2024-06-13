package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// kazi
public class Value1_Value2_sum_result extends JFrame implements ActionListener {
    private JFrame frame1 = new JFrame();
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JPanel panel3 = new JPanel();
    private JPanel panel4 = new JPanel();
    private JTextField textField1 = new JTextField(10);
    private JTextField textField2 = new JTextField(10);
    private JTextField textField3 = new JTextField(10);
    private JButton button1 = new JButton("Add/Sum");
    private JLabel label1 = new JLabel("Value of 1: ");
    private JLabel label2 = new JLabel("Value of 2: ");
    private JLabel label3 = new JLabel("SUM : ");

    public Value1_Value2_sum_result() {
//        frame1.add(panel1);
        frame1.setSize(200, 300);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame1.setLayout(new FlowLayout()); // eta change korle ki ki hoy
//frame1.setLayout(new BorderLayout()); // text field ase na
        frame1.setLayout(new GridLayout(0, 1)); // this is best

        panel1.add(label1);
        panel1.add(textField1);

        panel2.add(label2);
        panel2.add(textField2);

        panel4.add(button1);

        panel3.add(label3);
        panel3.add(textField3);

        frame1.getContentPane().add(panel1);
        frame1.getContentPane().add(panel2);
        frame1.getContentPane().add(panel4);
        frame1.getContentPane().add(panel3);


    }


    public static void main(String[] args) {
        new Value1_Value2_sum_result();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == button1) {
            int result = Integer.parseInt(textField1.getText()) + Integer.parseInt(textField2.getText());
            textField3.setText(String.valueOf(result) + ""); // nice
        }
    }
}

/*
package AddNumsGui;

import javax.swing.*;

public class Main extends JFrame {
    JButton addButtton = new JButton("Add");
    JTextField num1 = new JTextField();
    JTextField num2 = new JTextField();
    JLabel sum = new JLabel("sum");

    public Main() {
        num1.setColumns(10);
        num2.setColumns(10);

        JFrame frame = new JFrame("Add Numbers");
        JPanel panel = new JPanel();
        panel.add(num1);
        panel.add(num2);
        panel.add(addButtton);
        panel.add(sum);

        addButtton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent action) {
            if (action.getSource() == addButtton) {
                int n1 = Integer.parseInt(num1.getText());
                int n2 = Integer.parseInt(num2.getText());

                sum.setText((n1 + n2) + "");
            }
        }
        });

        frame.add(panel);

        frame.setSize(400, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Main();
    }
}

 */