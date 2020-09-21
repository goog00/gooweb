package com.gooweb.jvm;

import java.util.Objects;

/**
 * @author steng
 * @description
 * @date 2020-01-11 10:08 上午
 **/
public class Test {

    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return Objects.equals(name, test.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
//
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//
//    @Override
//    public String toString() {
//        return super.toString();
//    }

    public void changeValue(final StringBuffer str) {
        str.append("ddd");

    }


    public static void main(String[] args) {

        int k = fun(10);
        System.out.println(k);

    }

    public static int fun(int a){

        if(a == 1){
            return a;
        }
        System.out.println(a);
        return a + fun(a - 1);
    }
}
