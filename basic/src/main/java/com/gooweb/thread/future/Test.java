package com.gooweb.thread.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author sunteng
 * @create 2019-09-07 下午 4:44
 **/
public class Test {

    public static void main(String[] args) throws ExecutionException, InterruptedException {


        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Future<String> submit = executorService.submit(new MyRunnable("test0",10000L));
        //future的get 方法阻塞当前线程,直到返回结果,主线程才会往下执行
        String s = submit.get();
        System.out.println("key" + s);


        Future<String> submit1 = executorService.submit(new MyRunnable("test1",5000L));


        Future<String> submit2 = executorService.submit(new MyRunnable("test2",0L));



        System.out.println("主线程开始.....");




        String s1 = submit1.get();
        System.out.println("key" + s1);

        String s2 = submit2.get();
        System.out.println("key" + s2);

        System.out.println("主线程end.....");
    }
}
