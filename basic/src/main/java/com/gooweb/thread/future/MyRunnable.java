package com.gooweb.thread.future;

import java.util.concurrent.Callable;

/**
 * @author sunteng
 * @create 2019-09-07 下午 4:46
 **/
public class MyRunnable implements Callable<String> {


    private String key ;
    private Long seconds;

    public MyRunnable(String key,Long seconds) {
        this.key = key;
        this.seconds = seconds;
    }

    @Override
    public String call() throws Exception {
        String name = Thread.currentThread().getName();
        System.out.println("线程名称=" + name + ", key = " + key);
        Thread.sleep(seconds);
        System.out.println("睡眠5s");
        return key;
    }
}
