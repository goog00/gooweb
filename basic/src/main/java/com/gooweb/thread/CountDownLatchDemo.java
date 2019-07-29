package com.gooweb.thread;

import java.util.concurrent.CountDownLatch;

/**
 *
 *
 * @author sunteng
 * @create 2019-07-29 下午 3:47
 **/
public class CountDownLatchDemo {


    /**
     * CountDownLatch 允许以个或者多个线程等待其他线程完成操作
     *
     */

    public static void main(String[] args) {
        final CountDownLatch latch = new CountDownLatch(2);

        new Thread(){
            public void run(){
                try{
                    System.out.println("子线程" + Thread.currentThread().getName() + "正在执行");
                    Thread.sleep(3000);
                    System.out.println("子线程" + Thread.currentThread().getName() + "执行完毕");
                    latch.countDown();
                }catch (Exception e){

                }


            }
        }.start();

        new Thread(){
            public void run(){

                try {
                    System.out.println("子线程" + Thread.currentThread().getName() + "z正在执行");
                    Thread.sleep(3000);
                    System.out.println("子线程" + Thread.currentThread().getName() + "执行完毕");
                    latch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();


        try {
            System.out.println("等待2个子线程执行完毕。。");
            //阻塞当前线程
            latch.await();
            System.out.println("2个子线程已经执行完毕");
            System.out.println("继续执行主线程");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
