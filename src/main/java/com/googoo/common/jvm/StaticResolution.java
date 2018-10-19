package com.googoo.common.jvm;

public class StaticResolution {

    public static void sayHello(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        StaticResolution.sayHello();
    }
}
