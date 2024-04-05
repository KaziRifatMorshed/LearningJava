package GUI;

import javax.swing.*;
import java.awt.*;

public class   MyFrame extends JFrame {
    public MyFrame(){
        // JFrame this = new JFrame();
        this.setSize(480,480);
        this.setVisible(true);
        this.setTitle("Disco Club");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon img1_logo = new ImageIcon("answer.svg"); // ImageIcon
        this.setIconImage(img1_logo.getImage()); // img1_logo.getImage()

        this.getContentPane().setBackground(Color.YELLOW); // getContentPane()
    }
}
