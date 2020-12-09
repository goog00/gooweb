package com.gooweb.thread.future;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author steng
 * @description
 * @date 2020-11-14 15:21
 **/
public class FutureDemo {


    public static void main(String[] args) {
        Long start = System.currentTimeMillis();

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        try {
            List<Integer> list = new ArrayList<>();

            List<Future<Integer>> futureList = new ArrayList<>();

            //1.高速提交10个任务，每个任务返回一个Future入list
            for (int i = 0; i < 20; i++) {
                futureList.add(executorService.submit(new CallableTask(i + 1)));
            }
            Long getResultStart = System.currentTimeMillis();
            System.out.println("结果归集开始时间=" + new Date());
            //2.结果归集，用迭代器遍历futureList,高速轮询（模拟实现了并发），任务完成就移除
            while (futureList.size() > 0) {

                Iterator<Future<Integer>> iterable = futureList.iterator();
                while (iterable.hasNext()) {
                    Future<Integer> future = iterable.next();
                    //如果任务完成取结果，否则判断下一个任务是否完成
                    if (future.isDone() && !future.isCancelled()) {
                        //获取结果
                        Integer i = future.get();
                        System.out.println("任务i=" + i + "获取完成，移出任务队列！" + new Date());
                        list.add(i);
                        //任务完成移除任务
                        iterable.remove();
                    } else {
                        //避免CPU高速运转，这里休息1毫秒，CPU纳秒级别
                        Thread.sleep(1);
                    }
                }
            }

            System.out.println("list=" + list);
            System.out.println("总耗时=" + (System.currentTimeMillis() - start) + ",取结果归集耗时=" + (System.currentTimeMillis() - getResultStart));

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    static class CallableTask implements Callable<Integer> {

        Integer i;


        public CallableTask(Integer i) {
            super();
            this.i = i;
        }

        @Override
        public Integer call() throws Exception {

            if (i == 1) {
                //任务1耗时3秒
                Thread.sleep(3000);
            } else if (i == 5) {
                //任务1耗时5秒
                Thread.sleep(5000);
            } else {
                //任务1耗时1秒
                Thread.sleep(1000);
            }
            System.out.println("task线程：" + Thread.currentThread().getName() + "任务i=" + i + ",完成！" + new Date());
            return i;
        }
    }
}


