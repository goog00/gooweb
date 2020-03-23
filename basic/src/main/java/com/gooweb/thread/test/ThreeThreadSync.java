package com.gooweb.thread.test;

import java.util.concurrent.CountDownLatch;

/**
 * @author steng
 * @description
 * @date 2020-02-29 8:45 下午
 **/
public class ThreeThreadSync {
    static final  CountDownLatch t1Latch = new CountDownLatch(1);
    static final CountDownLatch t2Latch = new CountDownLatch(1);
    static final CountDownLatch t3Latch = new CountDownLatch(1);

    public static void main(String[] args) throws InterruptedException {


        Thread a = new Thread(new MyRunnable(t1Latch));
        a.start();
        t1Latch.await();
        Thread b = new Thread(new MyRunnable(t2Latch));
        b.start();
        t2Latch.await();
        Thread c = new Thread(new MyRunnable(t3Latch));
        c.start();
        t3Latch.await();

        System.out.println("main 线程");
    }

    static class MyRunnable implements Runnable{
        private  CountDownLatch t1Latch ;

        public MyRunnable(CountDownLatch t1Latch) {
            this.t1Latch = t1Latch;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " run");
            t1Latch.countDown();
        }
    }
}
