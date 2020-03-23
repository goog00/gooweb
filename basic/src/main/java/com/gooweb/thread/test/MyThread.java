package com.gooweb.thread.test;

/**
 * @author steng
 * @description
 * @date 2020-02-27 9:22 下午
 **/
public class MyThread {

    public static void main(String[] args) throws InterruptedException {

        Thread thread  = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){

                }

//                if(Thread.currentThread().isInterrupted()){
//                    //当前线程被中断
//                    System.out.println("当前线程被中断了");
//                } else {
//                    System.out.println("当前线程没有被中断了");
//                }
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    System.out.println(Thread.currentThread().isInterrupted());
//                    System.out.println("被中断了");
//                    e.printStackTrace();
//                }
            }
        });
        thread.start();
        Thread.sleep(3000);
//        System.out.println(thread.isInterrupted());
        thread.interrupt();

        System.out.println(thread.isInterrupted());
        System.out.println("main end");
    }


}
