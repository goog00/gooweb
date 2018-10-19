package com.googoo.pattern.template;

/**
 * 悍马h1
 *
 * @author sunteng
 * @create 2018-10-14 下午 9:33
 **/
public class HummerH2Model extends HummerModel {

    //
    @Override
    public void start() {
        System.out.println("悍马2发动");
    }

    @Override
    public void stop() {
        System.out.println("悍马2停止");
    }

    @Override
    public void alarm() {
        System.out.println("悍马2鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马2引擎声。");
    }

    @Override
    protected boolean isAlarm() {
        return false;
    }
}
