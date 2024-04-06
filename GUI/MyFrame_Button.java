package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("ALL")
public class MyFrame_Button extends JFrame implements ActionListener {
    JButton jb1;
    int count = 0;

    public MyFrame_Button() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(500, 500);
        this.setLayout(null);

        jb1 = new JButton();
        jb1.setHorizontalAlignment(JLabel.CENTER);
        jb1.setBounds(200, 100, 200, 75);
        this.add(jb1);
        jb1.addActionListener(this); // IMPORTANT // this class is implementing the interface
        jb1.setText("I'am a Button");
        jb1.setFocusable(false);

    }

//    @Override
//    public void actionPerformed(ActionEvent actionEvent) {
//        System.out.println(STR."\{count}.Pakhi Paka Pepe Khay");
//        count++;
//    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == jb1) {
            System.out.println(STR."\{count}.Pakhi Paka Pepe Khay");
            count++;

        }
    }
}
