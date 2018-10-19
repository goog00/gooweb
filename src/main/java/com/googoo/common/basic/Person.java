package com.googoo.common.basic;


/**
 * 人
 *
 * @author sunteng
 * @create 2018-09-18 下午 1:03
 **/
public class Person {


    public boolean isRead() {
        return true;
    }


    public void read(){
        System.out.println("person can read");
    }

    public void run(){
        System.out.println("person can run");
    }



    public void behavior(){
        if(isRead()){
            read();
        }
        run();
    }
}
