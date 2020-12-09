package com.gooweb.jdk8;

import javax.swing.*;

/**
 * @author steng
 * @description
 * @date 2020-11-04 10:14
 **/
public class K33 {

    private static void createAndShowGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        frame.pack();
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        createAndShowGUI();
    }

}
