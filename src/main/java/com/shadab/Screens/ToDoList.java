package com.shadab.Screens;

import java.awt.Color;

import javax.swing.JLabel;

public class ToDoList extends JLabel {
    public ToDoList(String[] arr) {
        this.setBounds(40, 140, 500, 40);
        String res = "";
        for (String s : arr) {
            if (s != null) {
                res += s + "\n";
            }
        }
        this.setText(res);
        this.setBackground(Color.green);
        this.setLayout(null);
    }

}
