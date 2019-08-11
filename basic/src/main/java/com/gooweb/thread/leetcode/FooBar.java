package com.gooweb.thread.leetcode;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/**
 * 1115. 交替打印FooBar
 * https://leetcode-cn.com/problems/print-foobar-alternately/solution/javashi-yong-yi-ge-countdownlatchhe-yi-ge-cyclicba/
 * @author sunteng
 * @create 2019-08-11 下午 3:38
 **/
public class FooBar {

    private int n;
    private CountDownLatch a;

    //使用CyclcBarrier保证任务按组执行
    private CyclicBarrier barrier;

    public FooBar(int n){
        this.n = n;
        a = new CountDownLatch(1);
        //保证每组有两个任务
        barrier = new CyclicBarrier(2);
    }

    public void foo(Runnable printFoo) throws BrokenBarrierException, InterruptedException {
        for(int i= 0; i < n; i++){
            printFoo.run();
            //printFoo 方法完成调用countDown
            a.countDown();
            barrier.await();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException, BrokenBarrierException {
        for(int i = 0; i< n; i++){
            a.await();//等待printFoo方法执行
            printBar.run();
            // 保证下一次依旧等待printFoo 方法先执行
            a = new CountDownLatch(1);
            //等待printFoo 方法执行完成
            barrier.await();
        }
    }





    public static void main(String[] args) {

        int n = 2;

        FooBar fooBar = new FooBar(2);

        new Thread(new FooThead()).start();
        new Thread(new BarThead()).start();
    }
}

 class FooThead implements  Runnable{

    @Override
    public void run() {
        System.out.println("foo");
    }
}
class BarThead implements  Runnable{

    @Override
    public void run() {
        System.out.println("bar");
    }
}