package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class jTextField extends JFrame implements ActionListener {
    JTextField _text_;
    JButton button1;
    Font active_font = new Font("Tahoma", Font.PLAIN, 18);
    Font inactive_font = new Font("Tahoma", Font.ITALIC, 12);
    JCheckBox checkBox1;

    public jTextField() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack(); // er kaj ki
        this.setVisible(true);
        this.setSize(400, 200);

        button1 = new JButton("Submit !!!");
        button1.addActionListener(this); // !!!
//        _text_.addActionListener(this); // WRONG APPROACH

        _text_ = new JTextField();
        _text_.setPreferredSize(new Dimension(250, 30)); // !!!
//        _text_.setForeground(Color.GREEN);
//        _text_.setBackground(Color.BLACK);
//        _text_.setCaretColor(Color.YELLOW);
//        _text_.setText("username");
        this.add(button1);
        this.add(_text_);


        checkBox1 = new JCheckBox();
        this.add(checkBox1);
        checkBox1.setText("Are you well ?");
        checkBox1.setFocusable(false);
        checkBox1.setFont(active_font);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String received = _text_.getText();

        // IS NOT WORKING // Further, it is shrinking the window size
//        if (received.isEmpty()) {
//            _text_.setText("Enter your username here...");
//            _text_.setForeground(Color.LIGHT_GRAY);
//        } else {
//            _text_.setText("");
//            _text_.setForeground(Color.BLACK);
//        }

        if (actionEvent.getSource() == button1) {
            System.out.println(STR."Welcome pocca \{received} and checkbox selection: \{checkBox1.isSelected()}");
            _text_.setEditable(false); // after submission, can't add new data
            button1.setEnabled(false);
        }
    }

    public static void main(String[] args) {
        new jTextField();
    }
}
