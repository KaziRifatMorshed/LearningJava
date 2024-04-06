package GUI;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("ALL")
public class MyFrame_Button extends JFrame implements ActionListener {
    JButton jb1;
    int count = 0;
    ImageIcon haha1 = new ImageIcon("/home/noobcodermsi/Documents/GitHub/LearningJava/GUI/Emoji_resized_resized.png");
    ImageIcon happy1 = new ImageIcon("/home/noobcodermsi/Documents/GitHub/LearningJava/GUI/happiness.jpg");
    JLabel happy_img = new JLabel(happy1);

    int center = SwingConstants.CENTER;


    public MyFrame_Button() {
        jb1 = new JButton();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(500, 500);
        this.setLayout(null);
        this.add(jb1);
        this.add(happy_img);
        happy_img.setVisible(false);
        happy_img.setBounds(100, 200, 500, 500);


        jb1.setBounds(100, 100, 250, 200);
        // jb1.setHorizontalAlignment(JLabel.CENTER);
        jb1.addActionListener(this); // IMPORTANT // this class is implementing the interface
        jb1.setText("I'am a Button");
        jb1.setFont(new Font("Calibri Light", Font.BOLD, 25)); // NOT WORKING
        jb1.setFocusable(false);
        jb1.setIcon(haha1);
        jb1.setHorizontalTextPosition(JButton.CENTER);
        jb1.setVerticalTextPosition(JButton.BOTTOM);
        jb1.setIconTextGap(5);
        jb1.setForeground(Color.BLUE);
        jb1.setBackground(Color.lightGray);
        jb1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        jb1.setEnabled(true);
        /*
        JLabel labelOne = new JLabel("raised BevelBorder", center);
        labelOne.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        */
    }

//    @Override
//    public void actionPerformed(ActionEvent actionEvent) {
//        System.out.println(STR."\{count}.Pakhi Paka Pepe Khay");
//        count++;
//    }

    @Override
    public void actionPerformed(ActionEvent alpha_actionEvent_meaw) {
        if (alpha_actionEvent_meaw.getSource() == jb1) {
            System.out.println(STR."\{count + 1}.Pakhi Paka Pepe Khay");
            count++;
        }
        if (count >= 5) {
            System.out.println("You are done");
            jb1.setEnabled(false);
            happy_img.setVisible(true);
        }
    }
}
