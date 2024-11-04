package GUI.ClickButtonAndOpenWindow;

import GUI.JFrame_1;
import GUI.MyFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class firstWindow extends JFrame_1 implements ActionListener {
    JButton button1;
    MyFrame frame1;

    public firstWindow() {
        frame1 = new MyFrame();
        button1 = new JButton("Click Me");
        frame1.add(button1);
        frame1.setLayout(null);  // without layout, button set bounds will not work
        button1.setBounds(50, 50, 150, 50); // !!!
        button1.setFocusable(false);
        button1.setVisible(true);
        button1.addActionListener(this); // !!!!!
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (button1 == actionEvent.getSource()) {
            secondWindow frame2 = new secondWindow();
        }
    }


}
