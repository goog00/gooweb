package com.gooweb.thread.join;


import java.util.concurrent.TimeUnit;

/**
 * @author steng
 * @description
 * @date 2020-08-28 8:38 上午
 **/
public class ThreadJoin {


    public static void main(String[] args) throws InterruptedException {

        Thread  previous = Thread.currentThread();

        for(int i = 0; i< 10 ;i++){

            Thread thread = new Thread(new JoinRunnable(previous),String.valueOf(i));
            thread.start();;
            previous = thread;
        }

        TimeUnit.SECONDS.sleep(5);
        System.out.println(Thread.currentThread().getName() + "terminate.");

    }

    private static class JoinRunnable implements Runnable{

        private Thread thread;

        public JoinRunnable(Thread thread){
            this.thread = thread;
        }

        @Override
        public void run() {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "terminate");

        }
    }
}
