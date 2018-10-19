package com.googoo.common.basic;

/**
 * 医生
 *
 * @author sunteng
 * @create 2018-09-18 下午 5:28
 **/
public class Doctor extends Person {


    public void read(){
        System.out.println("the Doctor can read");
    }

    public void run(){
        System.out.println("the Doctor run at hospital");
    }

    public boolean isRead() {
        return false;
    }

}
