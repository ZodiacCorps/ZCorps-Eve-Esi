package zcorps.eve_esi.display.navigation;

import javax.swing.*;

public class Nav {
    public void switchMarket(JPanel p1, JPanel p2, JScrollPane sp, JTable htable){
        p2.setBounds(0, 40, 250, 600);
        htable.setVisible(false);
        sp.setVisible(false);
        p1.setVisible(false);
        p2.setVisible(true);
    }

    public void switchCorporate(JPanel p1, JPanel p2, JScrollPane sp, JTable htable){
        p2.setBounds(0, 40, 250, 600);
        sp.setVisible(false);
        p1.setVisible(false);
        p2.setVisible(true);
        htable.setVisible(false);
    }
}
