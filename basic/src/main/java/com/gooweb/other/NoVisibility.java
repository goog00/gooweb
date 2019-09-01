package com.gooweb.other;

/**
 * @author sunteng
 * @create 2019-08-30 下午 4:15
 **/
public class NoVisibility {
    private static boolean ready;
    private static int number;

    private static class ReaderThread extends Thread{
        @Override
        public void run(){
            while (!ready){
                Thread.yield();
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
//        ready = true;
        ReaderThread readerThread = new ReaderThread();
        readerThread.start();
        number = 42;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ;
        ready = true;
    }
}
