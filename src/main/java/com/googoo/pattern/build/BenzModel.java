package com.googoo.pattern.build;

/**
 * 1
 *
 * @author sunteng
 * @create 2018-10-14 下午 9:56
 **/
public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("奔驰启动");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰停车");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰按喇叭");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰引擎声");
    }
}
