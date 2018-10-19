package com.googoo.common.basic;

public class SupperClassTest {

    private String name ;

    static {
        System.out.println("supper static bulk");
    }

    {
        System.out.println("supper bulk");
    }

    public SupperClassTest() {
        System.out.println("supper init ");
    }


}
