package com.googoo.pattern.build;

/**
 * 1
 *
 * @author sunteng
 * @create 2018-10-14 下午 9:56
 **/
public class BmwModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("宝马启动");
    }

    @Override
    protected void stop() {
        System.out.println("宝马停车");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马按喇叭");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马引擎声");
    }
}
