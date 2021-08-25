package com.shadab.Screens;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage implements ActionListener {
    private int X = 700;
    private int Y = 600;

    JFrame frame = new JFrame();
    JLabel todoLabel = new JLabel();
    JLabel label1 = new JLabel();
    JTextField textField = new JTextField();
    JButton addButton = new JButton("+");

    public HomePage() {

        textField.setBounds(40, 100, 500, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 24));
        textField.setText("Add a new todo");

        addButton.setBounds(550, 100, 80, 40);
        addButton.setBackground(new Color(23, 23, 23));
        addButton.setForeground(Color.white);
        addButton.setFont(new Font("Arial", Font.BOLD, 24));
        addButton.setFocusable(false);
        addButton.setLayout(null);
        addButton.addActionListener(this);

        label1.setVisible(true);
        label1.setBounds(40, 120, 500, 80);
        label1.setFont(new Font("Arial", Font.BOLD, 18));

        frame.setSize(X, Y);
        frame.add(new TopPanel());
        frame.add(textField);
        frame.add(todoLabel);
        frame.add(label1);
        frame.add(addButton);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String s1 = textField.getText();
        label1.setText(s1);

    }

}
