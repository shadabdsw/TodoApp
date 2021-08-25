package com.shadab.Screens;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HomePage {

    public HomePage() {
        int X = 800;
        int Y = 600;
        JButton button = new JButton();
        button.setBackground(new Color(23, 23, 23));
        button.setBounds(100, 200, 100, 40);
        button.setText("Click");
        button.setFont(new Font("Arial", Font.BOLD, 18));
        button.setForeground(Color.white);
        button.setFocusable(false);
        button.setLayout(null);

        JFrame frame = new JFrame();
        frame.setSize(X, Y);
        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
