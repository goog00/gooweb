package com.gooweb.thread.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sunteng
 * @create 2019-08-27 下午 5:03
 **/
public class ReenterLock01 implements Runnable{
    private static ReentrantLock lock = new ReentrantLock();

    private static int i = 0;


    @Override
    public void run() {
        for(int j = 0; i  < 10; j++){
            lock.lock();
           try{
               i++;
           } finally {
               lock.unlock();
           }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReenterLock01 reenterLock01 = new ReenterLock01();
        Thread t1 = new Thread(reenterLock01);
        Thread t2 = new Thread(reenterLock01);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);

    }
}
