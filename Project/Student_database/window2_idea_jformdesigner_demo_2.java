/*
 * Created by JFormDesigner on Fri Apr 12 14:03:50 BDT 2024
 */

package Project.Student_database;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author noobcodermsi
 */
public class window2_idea_jformdesigner_demo_2 extends JPanel {
    public window2_idea_jformdesigner_demo_2() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kazi Rifat Morshed
        button1 = new JButton();
        label1 = new JLabel();
        radioButton1 = new JRadioButton();

        //======== this ========
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .EmptyBorder
        ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion" , javax. swing .border . TitledBorder. CENTER ,javax . swing. border
        .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,java . awt
        . Color .red ) , getBorder () ) );  addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void
        propertyChange (java . beans. PropertyChangeEvent e) { if( "bord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException( )
        ;} } );

        //---- button1 ----
        button1.setText("text");

        //---- label1 ----
        label1.setText("Data Manipulation Table");

        //---- radioButton1 ----
        radioButton1.setText("text");

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(380, Short.MAX_VALUE)
                    .addComponent(button1)
                    .addGap(62, 62, 62))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(168, 168, 168)
                            .addComponent(label1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(211, 211, 211)
                            .addComponent(radioButton1)))
                    .addContainerGap(202, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(label1)
                    .addGap(18, 18, 18)
                    .addComponent(radioButton1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                    .addComponent(button1)
                    .addGap(45, 45, 45))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kazi Rifat Morshed
    private JButton button1;
    private JLabel label1;
    private JRadioButton radioButton1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
