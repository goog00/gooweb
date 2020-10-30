package com.gooweb.jdk8;

/**
 * @author steng
 * @description
 * @date 2020-10-29 11:06
 **/
public class LambdaDemo {

    /**
     * old way
     */
    public void old(){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world!");
            }
        };
        new Thread(r).start();

    }

    public void lambda(){
        new Thread(()-> System.out.println("lambda Hello world")).start();
    }
}
