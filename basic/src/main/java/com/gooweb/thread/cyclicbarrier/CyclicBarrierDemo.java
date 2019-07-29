package com.gooweb.thread.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * @author sunteng
 * @create 2019-07-29 下午 7:26
 **/
public class CyclicBarrierDemo {

    public static void main(String[] args) {
        int n = 4;
        CyclicBarrier barrier = new CyclicBarrier(n);
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
            System.out.println("线程" + Thread.currentThread().getName() + "正在写入数据");
            try{
                Thread.sleep(5000);
                System.out.println("线程" + Thread.currentThread().getName() + "写入数据完毕，等待其他线程写入完毕");
                cyclicBarrier.await();
            } catch (Exception e){

            }
            System.out.println("所有线程写入完毕，继续处理其他任务。。");

        }
    }
}
