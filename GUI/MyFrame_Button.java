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
        jb1.setBounds(200, 100, 100, 50);
        this.add(jb1);
        jb1.addActionListener(this); // ???
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println(STR."\{count}.Pakhi Paka Pepe Khay");
        count++;
    }
}
