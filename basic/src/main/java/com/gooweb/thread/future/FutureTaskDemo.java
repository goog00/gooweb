package com.gooweb.thread.future;

import reactor.rx.action.filter.TakeAction;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * @author steng
 * @description
 * @date 2020-08-29 10:23 上午
 **/
public class FutureTaskDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor =  Executors.newCachedThreadPool();

        Task task = new Task();

        FutureTask<Integer> futureTask = new FutureTask<>(task);


        executor.submit(futureTask);

        executor.shutdown();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("主线程在执行任务");


        System.out.println("task运行结果" + futureTask.get());

        System.out.println("所有任务执行完毕");
    }
}
