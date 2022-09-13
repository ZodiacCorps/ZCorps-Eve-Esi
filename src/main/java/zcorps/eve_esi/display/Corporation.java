package zcorps.eve_esi.display;

import javax.swing.*;

public class Corporation {
    private void openCorporate(JButton closeMenu, JPanel p1, JPanel p2, JPanel p4, JPanel p5, JLabel dbBg){
        closeMenu.setText("<html><p>O<br>p<br>e<br>n</p></html>");
        p1.setVisible(false);
        p2.setBounds(0, 40, 250, 600);
        p2.setVisible(false);
        p5.setLocation(0, 250);
        p4.setLocation(0,40);
        p4.setSize(880, 605);
        dbBg.setSize(880, 605);
        dbBg.setIcon(new ImageIcon("ZodiacCorpsLarge.png"));
    }
}
