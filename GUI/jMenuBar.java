package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.security.Key;

public class jMenuBar extends JFrame implements ActionListener {

    JFrame frame1;
    JMenuBar menuBar1;
    JMenuItem load_item;
    JMenuItem save_item;
    JMenuItem exit_item;

    public jMenuBar() {
        frame1 = new JFrame();
        frame1.setSize(500, 500);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);
        frame1.setLayout(new FlowLayout());

        menuBar1 = new JMenuBar();
//        frame1.setMenuBar(menuBar1);
        frame1.setJMenuBar(menuBar1);
//        menuBar1.setVisible(true);

        JMenu file_menu = new JMenu("File");
        JMenu edit_menu = new JMenu("Edit");
        JMenu help_menu = new JMenu("Help");

        menuBar1.add(file_menu);
        menuBar1.add(edit_menu);
        menuBar1.add(help_menu);

        load_item = new JMenuItem("Load");
        save_item = new JMenuItem("Save");
        exit_item = new JMenuItem("Exit");

        file_menu.add(load_item);
        file_menu.add(save_item);
        file_menu.add(exit_item);

        load_item.addActionListener(this);
        save_item.addActionListener(this);
        exit_item.addActionListener(this);

        // new syntax
        load_item.setMnemonic(KeyEvent.VK_L); //  l == load
        save_item.setMnemonic(KeyEvent.VK_S);
        exit_item.setMnemonic(KeyEvent.VK_X);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == load_item) {
            System.out.println("File Loaded");
        }
        if (actionEvent.getSource() == save_item) {
            System.out.println("File Saved");
        }
        if (actionEvent.getSource() == exit_item) {
            System.out.println("Exiting");
            System.exit(0);

        }
    }

    public static void main(String[] args) {
        new jMenuBar();
    }
}
