package com.gooweb.geekbang.concurrency.chapter1;

/**
 * 缓存可见性问题demo
 * @author sunteng
 * @create 2019-07-18 下午 7:15
 **/
public class Test {

    private static  long count = 0;

    private void add10k(){
        int idx = 0;
        while(idx++ < 10000){
            count += 1;
        }
    }

    public static long calc() throws InterruptedException {
        final Test test = new Test();

        //创建两个线程，执行add() 操作
        Thread th1 = new Thread(()->{
           test.add10k();
        });

        Thread th2 = new Thread(()->{
           test.add10k();
        });

        //启动两个线程
        th1.start();
        th2.start();
        //等待连个线程执行结束
        th1.join();
        th2.join();

        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        long calc = calc();
        System.out.println(calc);
    }
}
