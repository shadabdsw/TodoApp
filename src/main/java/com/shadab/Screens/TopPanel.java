package com.shadab.Screens;

import java.awt.Font;
import javax.swing.JLabel;

public class TopPanel extends JLabel {

    public TopPanel() {
        this.setBounds(40, 20, 500, 80);
        this.setText("Todo App");
        this.setFont(new Font("Arial", Font.BOLD, 48));
        this.setLayout(null);

    }

}
