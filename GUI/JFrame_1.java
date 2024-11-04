package GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JFrame_1 {
    public static void main(String[] args) {

        ImageIcon img1 = new ImageIcon("/mnt/GitHub/LearningJava/GUI/katka.png"); // but it needs to resize to make it visible // ?????


        JLabel label1 = new JLabel();
        label1.setText("13 March, KU Katka Tragedy Day");
        label1.setIcon(img1);
        label1.setHorizontalTextPosition(JLabel.CENTER); // ছবির কোন পাশে টেক্সট যাবে ? relative to image-icon
        // label1.setHorizontalTextPosition(JLabel.CENTER);
        // label1.setHorizontalTextPosition(JLabel.LEFT);
        label1.setVerticalTextPosition(JLabel.TOP);
        label1.setForeground(Color.YELLOW);
        label1.setVerticalAlignment(JLabel.CENTER); // set icon+text position within the label
        label1.setHorizontalAlignment(JLabel.CENTER);
        // label1.setBounds(0, 0, 550, 550); // limiting it
        label1.setFont(new Font("Calibri Light", Font.PLAIN, 30)); // new Font
        label1.setIconTextGap(10); // remember

        // label দিয়ে ফ্রেম এর ব্যাকগ্রাউন্ড কালার চেঞ্জ করছি
        label1.setBackground(Color.black); // transparency vs opacity
        label1.setOpaque(true); // remember

        Border simana = BorderFactory.createLineBorder(Color.CYAN, 5);
        label1.setBorder(simana); // remember


        MyFrame myFrame1 = new MyFrame();
        myFrame1.setSize(500, 500); // default e 480x480 te on hobe
        myFrame1.add(label1);

//        // following codes are acting wired !!!!
//        myFrame1.setLayout(null); // ???
//        myFrame1.pack(); // ???


    }
}
