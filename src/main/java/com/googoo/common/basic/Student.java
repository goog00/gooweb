package com.googoo.common.basic;

/**
 * 学生
 *
 * @author sunteng
 * @create 2018-09-18 下午 1:06
 **/
public class Student extends Person {

    public void read(){
        System.out.println("the student can read");
    }

    public void run(){
        System.out.println("the student run at school");
    }

    public static void main(String[] args) {
        Person person = new Student();
        person.behavior();

        Person doctor = new Doctor();
        doctor.isRead();
        doctor.behavior();
    }

}
