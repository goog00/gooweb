package com.gooweb.thread.completablefuture;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

/**
 * @author sunteng
 * @create 2019-09-08 下午 5:13
 **/
@Slf4j
public class Demo4 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService pool = Executors.newFixedThreadPool(10);

        CompletableFuture<String> futrue = CompletableFuture.supplyAsync(()->{
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return "ABC";
        },pool);

        futrue.thenApply(s -> {
            log.info("First transformation");
            return s.length();
        });

        futrue.get();

        pool.shutdown();

        pool.awaitTermination(1,TimeUnit.MINUTES);

        futrue.thenApplyAsync(s ->{
            log.info("Second transformation");
            return s.length();
        });

    }
}
