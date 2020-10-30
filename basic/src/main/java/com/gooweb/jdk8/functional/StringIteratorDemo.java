package com.gooweb.jdk8.functional;

/**
 * @author steng
 * @description
 * @date 2020-10-29 14:16
 **/
public class StringIteratorDemo {

    public void commonTest() {
        final String string = "hello";
        string.chars().forEach(System.out::println);
    }


    public void toCharTest() {
        final String string = "hello";
        string.chars()
                .mapToObj(ch -> ((char) ch))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        StringIteratorDemo demo = new StringIteratorDemo();
        demo.commonTest();
        demo.toCharTest();
    }
}
