package com.gooweb.thread.test;

import java.util.concurrent.locks.LockSupport;

/**
 * @author steng
 * @description
 * @date 2020-02-28 3:38 下午
 **/
public class LockSupportTest {

    public static void main(String[] args) {
        Thread parkThread = new Thread(new ParkThread());
        parkThread.start();
        System.out.println("start 唤醒线程");
        LockSupport.unpark(parkThread);
        System.out.println("end 线程唤醒");
    }


    static class ParkThread implements Runnable{

        @Override
        public void run() {
            System.out.println("start blocked thread");
            LockSupport.park();
            System.out.println("end blocked thread");
        }
    }
}
