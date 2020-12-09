package com.gooweb.swing;

import javax.swing.*;

/**
 * @author steng
 * @description
 * @date 2020-11-04 13:10
 **/
public class SwingLoginExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("login example");

        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);



    }

    public static void placeComponents(JPanel panel){

        panel.setLayout(null);

        JLabel userLabel = new JLabel("User:");

        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);


        JLabel passwordLabel = new JLabel("password:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(100,50,165,25);
        panel.add(passwordField);

        JButton loginButton = new JButton("login");
        loginButton.setBounds(10,80,80,25);
        panel.add(loginButton);

    }

}
