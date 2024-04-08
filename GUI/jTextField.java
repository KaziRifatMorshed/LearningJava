package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jTextField extends JFrame implements ActionListener {
    JTextField _text_;
    JButton button1;

    public jTextField() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack(); // er kaj ki
        this.setVisible(true);
        this.setSize(400, 400);

        button1 = new JButton("Submit !!!");
        button1.addActionListener(this); // !!!

        _text_ = new JTextField();
        _text_.setPreferredSize(new Dimension(250, 50)); // !!!
        this.add(button1);
        this.add(_text_);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == button1) {
            String received = _text_.getText();
            System.out.println(STR."Welcome \{received}");
        }
    }

    public static void main(String[] args) {
        new jTextField();
    }
}
