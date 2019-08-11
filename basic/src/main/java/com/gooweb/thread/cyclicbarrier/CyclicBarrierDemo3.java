package com.gooweb.thread.cyclicbarrier;


import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * 为await指定时间的效果
 * @author sunteng
 * @create 2019-07-29 下午 7:49
 **/
public class CyclicBarrierDemo3 {


    /**
     * 上面的代码在main方法的for循环中，故意让最后一个线程启动延迟，
     * 因为在前面三个线程都达到barrier之后，等待了指定的时间发现第四个线程还没有达到barrier，就抛出异常并继续执行后面的任务
     * @param args
     */
    public static void main(String[] args) {
        int N =4;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(N);
        for(int i = 0;i < N; i++){
            if(i < N -1){
                new Writer(cyclicBarrier).start();
            } else {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                new Writer(cyclicBarrier).start();
            }
        }
    }



    static class Writer extends Thread{
        private CyclicBarrier cyclicBarrier ;

        public Writer(CyclicBarrier cyclicBarrier){
            this.cyclicBarrier = cyclicBarrier;
        }


        @Override
        public void run(){
            System.out.println("线程" + Thread.currentThread().getName() + "正在写入数据。。");

            try {
                Thread.sleep(5000);
                System.out.println("线程" + Thread.currentThread().getName() + "写入数据完毕，等待其他线程写入完毕");

                //当前线程等待2000毫秒，
                cyclicBarrier.await(2000, TimeUnit.MICROSECONDS);
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "所有线程写入完毕，继续处理其他任务。。");

        }
    }
}
