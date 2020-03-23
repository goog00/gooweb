package com.gooweb.test;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author steng
 * @description
 * @date 2020-02-19 8:27 下午
 **/
@Slf4j
public class Test {

    public static void main(String[] args) throws Exception {
        Test test = new Test();
//        test.join();
        test.testThreadByCallable();

    }

    public void join() throws Exception {
        Thread main = Thread.currentThread();
        main.setName("main######");
        log.info("{} is run。",main.getName());
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                log.info("{} begin run",Thread.currentThread().getName());
                try {
                    Thread.sleep(60000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                log.info("{} end run",Thread.currentThread().getName());
            }
        });
        thread.setName("test######");
        // 开一个子线程去执行
        thread.start();
        // 当前主线程等待子线程执行完成之后再执行
        thread.join(500000L);
        log.info("{} is end", Thread.currentThread());
    }

    public void testThreadByCallable() throws ExecutionException, InterruptedException {
        FutureTask futureTask = new FutureTask(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(3000);
                String result = "子线程" + Thread.currentThread().getName();
                log.info("子线程正在运行" + Thread.currentThread().getName());
                return result;
            }
        });
        new Thread(futureTask).start();
        log.info("返回的结果={}",futureTask.get());
    }

}
