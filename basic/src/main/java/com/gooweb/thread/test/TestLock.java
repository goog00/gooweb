package com.gooweb.thread.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author steng
 * @description
 * @date 2020-02-27 10:12 下午
 **/
public class TestLock {

    public void test() throws InterruptedException {
        final Lock lock = new ReentrantLock();
        lock.lock();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                System.out.println(Thread.currentThread().getName() + " interrupted");
            }
        },"child thread -1");
        t1.start();
        Thread.sleep(1000);
        t1.interrupt();
        Thread.sleep(100000);
    }

    public static void main(String[] args) throws InterruptedException {
        new TestLock().test();
    }
}
