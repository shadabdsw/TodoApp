package com.shadab.Screens;

import javax.swing.JFrame;

public class HomePage {

    public HomePage() {
        int X = 800;
        int Y = 600;
        JFrame frame = new JFrame();
        frame.setSize(X, Y);
        //frame.setBounds(1000, 500, X, Y); //used to move the frame on screen 1000 and 500 are padding
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
