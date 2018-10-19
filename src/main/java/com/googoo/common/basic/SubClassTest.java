package com.googoo.common.basic;

public class SubClassTest extends SupperClassTest {

    private String name;

    static {
        System.out.println("subclass static bulk");
    }

    {
        System.out.println("subclass bulk");
    }

    public SubClassTest() {
        System.out.println("subclass init ");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        SubClassTest subClassTest = new SubClassTest();

        Class<?> aClass = Class.forName("com.googoo.common.basic.SubClassTest");


    }
}
