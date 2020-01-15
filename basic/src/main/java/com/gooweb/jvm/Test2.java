package com.gooweb.jvm;


/**
 * @author steng
 * @description
 * @date 2020-01-11 11:03 上午
 **/
public class Test2 {



    void doSomething(){
        int t = 2;
        int tail = 4;

      if(t != (t = tail)){
          System.out.println("not equal");
      }

    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.doSomething();
    }
}
