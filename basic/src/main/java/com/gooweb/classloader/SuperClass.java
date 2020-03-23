package com.gooweb.classloader;

/**
 * @author steng
 * @description
 * @date 2020-03-11 6:31 下午
 **/
public class SuperClass {

    static {
        System.out.println("superclass init");
    }

    public static int value = 123;

}
