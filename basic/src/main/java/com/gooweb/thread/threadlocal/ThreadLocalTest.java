package com.gooweb.thread.threadlocal;

/**
 * @author steng
 * @description
 * @date 2020-08-14 10:42 上午
 **/
public class ThreadLocalTest {

    static ThreadLocal<String> threadLocal = new ThreadLocal<>();
    static ThreadLocal<String> threadLocal2 = new ThreadLocal<>();



    private static void print(){
        System.out.println(threadLocal.get());
        System.out.println(threadLocal2.get());
    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                threadLocal.set("hello,thread1");
                threadLocal2.set("hello,second");
                print();
            }
        });
        thread1.start();
//        thread1.join();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                threadLocal.set("hello,thread2");
                print();
            }
        });
        thread2.start();
//        thread2.join();

    }
}
