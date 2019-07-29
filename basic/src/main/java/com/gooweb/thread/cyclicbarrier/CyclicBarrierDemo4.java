package com.gooweb.thread.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * CyclicBarrier重用
 * @author sunteng
 * @create 2019-07-29 下午 8:08
 **/
public class CyclicBarrierDemo4 {

    public static void main(String[] args) {
        int N = 4;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(N);
        for(int i = 0; i < N; i++){
            new Writer(cyclicBarrier).start();
        }

        try{
          Thread.sleep(25000);
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("CyclicBarrier 重用");

        for(int i = 0; i < N; i++){
            new Writer(cyclicBarrier).start();
        }
    }


    static class Writer extends Thread{
        private CyclicBarrier cyclicBarrier;
        public Writer(CyclicBarrier cyclicBarrier){
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run(){
            System.out.println("线程" + Thread.currentThread().getName() + "正在写入数据。。");

            try {
                Thread.sleep(5000);
                System.out.println("线程" + Thread.currentThread().getName() + "写入数据完毕，等待其他线程写入完毕");
                cyclicBarrier.await();
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "所有线程写入完毕，继续处理其他任务");
        }

    }

}
