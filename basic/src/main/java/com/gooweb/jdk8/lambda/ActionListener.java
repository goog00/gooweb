package com.gooweb.jdk8.lambda;

import java.awt.event.ActionEvent;

/**
 * @author steng
 * @description
 * @date 2020-10-29 11:55
 **/
public interface ActionListener {
    void actionPerformed(ActionEvent e);


    //匿名类的方式实现
//    button.addActionListener(new ActionListener() {
//        public void actionPerformed(ActionEvent e) {
//            ui.dazzle(e.getModifiers());
//        }
//    });
}


