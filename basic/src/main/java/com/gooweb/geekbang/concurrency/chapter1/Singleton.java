package com.gooweb.geekbang.concurrency.chapter1;

/**
 * 编译优化带来的有序性问题
 * @author sunteng
 * @create 2019-07-18 下午 7:29
 **/
public class Singleton {

    static Singleton instance;

    static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
