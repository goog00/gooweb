package com.gooweb.thread;

import java.util.concurrent.CountDownLatch;

/**
 * @author sunteng
 * @create 2019-07-29 下午 4:27
 **/
public class CountDownLatchTest {

    //CountDownLatch的构造函数接收一个int类型的参数作为计数器，如果你想等待N个点完
    //成，这里就传入N。
    static CountDownLatch c = new CountDownLatch(2);

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
                c.countDown();
                System.out.println(2);
                c.countDown();
            }
        }).start();

        //阻塞当前线程，直到N变成0
        c.await();
        System.out.println(3);
    }
}
