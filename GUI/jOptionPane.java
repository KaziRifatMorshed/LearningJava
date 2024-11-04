package GUI;

import javax.swing.*;

public class jOptionPane {
    public static void main(String[] args) {
//        JOptionPane.showConfirmDialog(null,"This is some useless stuffs", "title ya", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showConfirmDialog(null, "This is some useless stuffs", "title ya", JOptionPane.DEFAULT_OPTION);
//        JOptionPane.showConfirmDialog(null, "This is some useless stuffs", "title ya", JOptionPane.INFORMATION_MESSAGE); /// i ase na, kam kore na
//        JOptionPane.showConfirmDialog(null, "JOptionPane.YES_NO_CANCEL_OPTION", "title ya", JOptionPane.YES_NO_CANCEL_OPTION);
//        JOptionPane.showConfirmDialog(null, "JOptionPane.QUESTION_MESSAGE", "title ya", JOptionPane.QUESTION_MESSAGE); // KAM KORE NA, ERROR ASE
//        JOptionPane.showConfirmDialog(null, "JOptionPane.WARNING_MESSAGE", "title ya", JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showConfirmDialog(null, "JOptionPane.OK_CANCEL_OPTION", "title ya", JOptionPane.OK_CANCEL_OPTION);
//        JOptionPane.showConfirmDialog(null, "JOptionPane.ERROR_MESSAGE", "title ya", JOptionPane.ERROR_MESSAGE);
//        JOptionPane.showConfirmDialog(null, "JOptionPane.YES_NO_OPTION", "title ya", JOptionPane.YES_NO_OPTION);
//
//        JOptionPane.showConfirmDialog(null, "JOptionPane.YES_NO_CANCEL_OPTION", "a title", JOptionPane.YES_NO_CANCEL_OPTION);
        /*
        int user_choice = JOptionPane.showConfirmDialog(null, "Wonna input your name ?", "a title", JOptionPane.YES_NO_CANCEL_OPTION);
        if (user_choice == 0){
            String name = JOptionPane.showInputDialog("What is your name, bro?");
            System.out.println(name);
        }
        */
//        JOptionPane.showOptionDialog(null, "You are awesome", "Hi", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, 0);
        String[] _responses = {"THikase", "Tham", "Get Lost"};
        JOptionPane.showOptionDialog(null, "You are awesome", "Hi", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, _responses, 0);
    }
}
