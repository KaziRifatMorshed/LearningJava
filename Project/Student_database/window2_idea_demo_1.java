package Project.Student_database;

import javax.swing.*;

public class window2_idea_demo_1 {
    private JPanel windowTwo_IDEA_demo_1;
    protected JFrame windoW2 = null;

    public window2_idea_demo_1() {
        windoW2 = new JFrame();
        windoW2.setTitle("daTa maNipulation Form");
        windoW2.setSize(500, 500);
        windoW2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windoW2.setVisible(true);
        windoW2.setContentPane(windowTwo_IDEA_demo_1);
    }

    public static void main(String[] args) {
        new window2_idea_demo_1();
    }
}
