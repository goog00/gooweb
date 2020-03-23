package com.gooweb.test;

import com.gooweb.test.SupperClass;

/**
 * @author steng
 * @description
 * @date 2020-01-29 5:56 下午
 **/
public class Test2 extends SupperClass {


    public static void main(String[] args) throws InterruptedException {

        final Demo demo = new Demo();
        demo.setName("dd");
        Demo demo1 = new Demo();
//        demo = demo1;



    }






}

class Demo{
    public Demo(){

    }
    String name;
    public void setName(String name){
        this.name = name;
    }
}