package com.gooweb.test;

/**
 * @author steng
 * @description
 * @date 2020-01-30 4:01 下午
 **/
public class MyRunable implements Runnable {
    @Override
    public void run() {
        System.out.println("thread name " + Thread.currentThread().getName());
    }
}
