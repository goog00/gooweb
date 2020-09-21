package com.gooweb.thread.future;

import java.util.concurrent.Callable;

/**
 * @author steng
 * @description
 * @date 2020-08-23 7:58 下午
 **/
public class Task implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("子线程在进行计算");
//        Thread.sleep(3000);
        int sum = 0;
        for(int i = 0; i < 10; i++){
            sum+=i;
        }
        return sum;
    }
}
