package com.gooweb.jdk8;

/**
 * @author steng
 * @description
 * @date 2020-10-29 11:14
 **/
public class HelloWorld {

    void print(){
        System.out.println("instanceRefence::methodName");
    }

    public void printInfo(){
        System.out.println("printInfo");

        new Thread(this::print).start();
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.printInfo();
    }
}
