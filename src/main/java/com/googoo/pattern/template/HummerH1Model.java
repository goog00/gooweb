package com.googoo.pattern.template;

/**
 * 悍马h1
 *
 * @author sunteng
 * @create 2018-10-14 下午 9:33
 **/
public class HummerH1Model extends HummerModel {

    private boolean alarmFlag = true;
    //
    @Override
    public void start() {
        System.out.println("悍马1发动");
    }

    @Override
    public void stop() {
        System.out.println("悍马1停止");
    }

    @Override
    public void alarm() {
        System.out.println("悍马1鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马1引擎声。");
    }

    protected boolean isAlarm(){
        return this.alarmFlag;
    }

    //要不要响喇叭，是由客户来决定的
    public void setAlarmFlag(boolean isAlarm){
        this.alarmFlag = isAlarm;
    }

}
