package com.gooweb.thread.cyclicbarrier;


import java.util.concurrent.CyclicBarrier;

/**
 * @author sunteng
 * @create 2019-07-29 下午 7:35
 **/
public class CyclicBarrierDemo2 {

    public static void main(String[] args) {
        int n = 4;
        CyclicBarrier barrier = new CyclicBarrier(n, new Runnable() {
            @Override
            public void run() {
                System.out.println("当前线程" + Thread.currentThread().getName());
            }
        });

        for(int i = 0; i < n; i++){
            new Writer(barrier).start();
        }

    }



    static class Writer extends Thread{
        private CyclicBarrier cyclicBarrier;

        public Writer(CyclicBarrier cyclicBarrier){
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run(){
            System.out.println("线程" + Thread.currentThread().getName() + "在写入数据");
            try {
                Thread.sleep(5000);
                System.out.println("线程" + Thread.currentThread().getName() + "写入数据完毕，等待其他线程写入完毕");
                //当前线程等待计数器为0
                cyclicBarrier.await();

            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("所有线程写入完毕，继续处理其他任务");

        }
    }
}
