package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jComboBox implements ActionListener {
    MyFrame frame1;
    String[] animals = {"Dog", "Cat", "Bird", "Rhino", "Bull"};
    JComboBox<String> comboBox;

    public jComboBox() {
        frame1 = new MyFrame();
        frame1.setLayout(new FlowLayout());
        comboBox = new JComboBox<String>(animals);
        frame1.add(comboBox);
        comboBox.addActionListener(this);
        comboBox.setEditable(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == comboBox) {
            String which_one_is_selected = (String) comboBox.getSelectedItem();
            System.out.println(which_one_is_selected);
        }
    }

    public static void main(String[] args) {
        new jComboBox();
    }
}
