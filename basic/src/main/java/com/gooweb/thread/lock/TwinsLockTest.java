package com.gooweb.thread.lock;

import java.util.concurrent.locks.Lock;

/**
 * @author steng
 * @description
 * @date 2020-02-20 8:58 下午
 **/
public class TwinsLockTest {


    public static void main(String[] args) {
        TwinsLockTest test = new TwinsLockTest();
        test.test();
    }

    public void test(){
        final Lock lock = new TwinsLock();

        class Worker extends Thread{
            public void run(){
                while (true){
                    lock.lock();
                    try {
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getName());
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock.unlock();
                    }
                }
            }
        }

        //启动10个线程
        for(int i = 0; i < 10; i++){
            Worker w = new Worker();
//            w.setDaemon(true);
            w.start();
        }

        for(int i = 0 ;i < 10; i++){
            try {
                Thread.sleep(1000);
                System.out.println();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
