package com.gooweb.thread.future;

import java.util.concurrent.*;

/**
 * @author steng
 * @description
 * @date 2020-08-23 8:00 下午
 **/
public class MyTest {

    public static void main(String[] args) {

        //第一种方式
        ExecutorService executor = Executors.newCachedThreadPool();

        Task task = new Task();

        FutureTask<Integer> futureTask = new FutureTask<>(task);

        executor.submit(futureTask);
        executor.shutdown();



//        try {
//            Thread.sleep(1000);
//        }catch (Exception e){
//
//        }

        System.out.println("主线程执行任务");
        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
