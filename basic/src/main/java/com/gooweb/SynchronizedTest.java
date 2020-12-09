package com.gooweb;

/**
 * @author sunteng
 * @create 2019-08-22 下午 9:17
 **/
public class SynchronizedTest {

    public synchronized void test1(){

    }

    public void test2(){
        synchronized (this){

        }
    }


    public void test(){
        System.out.println("再来一次,");
    }
}
