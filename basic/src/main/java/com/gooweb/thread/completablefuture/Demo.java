package com.gooweb.thread.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author sunteng
 * @create 2019-09-08 下午 2:25
 **/
public class Demo {

    public static void main(String[] args) {

        //任务1:洗水壶 --> 烧开水
        CompletableFuture<Void> f1 = CompletableFuture.runAsync(()->{
            System.out.println("T1: 洗水壶...");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("T1:烧开水......");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        //任务2: 洗茶壶 --> 洗茶杯 --> 拿茶叶
        CompletableFuture<String> f2 =
        CompletableFuture.supplyAsync(()->{
            System.out.println("T2: 洗茶壶...");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.println("T2:洗茶杯....");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("T2: 拿茶叶....");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return "龙井";
        });

        //任务3: 任务1 和 任务2 完成后执行泡茶
        CompletableFuture<String> f3 = f1.thenCombine(f2,(__,tf)->{
            System.out.println("T1: 拿到茶叶:" + tf);
            System.out.println("T1: 泡茶.....");
            return "上茶:" + tf;
        });


        //等待任务3执行结果
        System.out.println(f3.join());


    }
}
