package GUI;

import javax.swing.*;

public class JButton_1 extends MyFrame {
    public static void main(String[] args) {
//        MyFrame frame1 = new MyFrame();
//
//        JButton button1 = new JButton();
//        button1.setBounds(200, 100, 100, 50);
//        frame1.add(button1);
        MyFrame_Button f1 = new MyFrame_Button();
    }
}


/*
public static void main(String[] args) {
    JFrame frame = new JFrame("Borders");

    int center = SwingConstants.CENTER;
    JLabel labelOne = new JLabel("raised BevelBorder", center);
    labelOne.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
    JLabel labelTwo = new JLabel("EtchedBorder", center);
    labelTwo.setBorder(BorderFactory.createEtchedBorder());
    JLabel labelThree = new JLabel("MatteBorder", center);
    labelThree.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.pink));
    JLabel labelFour = new JLabel("TitledBorder", center);
    Border etch = BorderFactory.createEtchedBorder();
    labelFour.setBorder(BorderFactory.createTitledBorder(etch, "Title"));
    JLabel labelFive = new JLabel("TitledBorder", center);
    Border low = BorderFactory.createLoweredBevelBorder();
    labelFive.setBorder(BorderFactory.createTitledBorder(low, "Title", TitledBorder.RIGHT,
            TitledBorder.BOTTOM));
    JLabel labelSix = new JLabel("CompoundBorder", center);
    Border one = BorderFactory.createEtchedBorder();
     Border two = BorderFactory.createMatteBorder(4, 4, 4, 4, Color.blue);
    labelSix.setBorder(BorderFactory.createCompoundBorder(one, two));

    frame.setLayout(new GridLayout(3, 2));
    frame.add(labelOne);
    frame.add(labelTwo);
    frame.add(labelThree);
    frame.add(labelFour);
    frame.add(labelFive);
    frame.add(labelSix);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
}
*/