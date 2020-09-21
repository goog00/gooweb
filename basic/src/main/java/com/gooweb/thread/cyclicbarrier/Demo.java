package com.gooweb.thread.cyclicbarrier;

import java.util.concurrent.*;

/**
 * @author steng
 * @description
 * @date 2020-08-23 7:17 下午
 **/
public class Demo {

    private final ConcurrentMap<Object, Future<String>> taskCache = new ConcurrentHashMap<Object, Future<String>>();

    private String executionTask(final String taskName) {
        while (true) {
            Future<String> future = taskCache.get(taskName);
            if (future == null) {
                Callable<String> task = new Callable<String>() {
                    @Override
                    public String call() throws Exception {
                        return taskName;
                    }
                };

                FutureTask<String> futureTask = new FutureTask<>(task);
                future = taskCache.putIfAbsent(taskName, futureTask);

                if (future == null) {
                    future = futureTask;
                    futureTask.run();
                }
            }

            try {
                return future.get();
            } catch (Exception e) {
                taskCache.remove(taskName,future);
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread name" + Thread.currentThread().getName());
            }
        });

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread name" + Thread.currentThread().getName());
            }
        });


        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread name" + Thread.currentThread().getName());
            }
        });


    }
}
