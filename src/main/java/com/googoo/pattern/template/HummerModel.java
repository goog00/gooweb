package com.googoo.pattern.template;

/**
 * 悍马抽象类
 *
 * @author sunteng
 * @create 2018-10-14 下午 9:28
 **/
public abstract class HummerModel {

    /**
     * 首先，这个模型要能够被发动起来，别管是手摇发动，还是电力发动，反正是要能够发动起来，那这个实现要在实现类里了
     */
    public abstract void start();

    /**
     * 能发动，还要能停下来
     */
    public abstract void stop();

    /**
     * 喇叭会发声，是滴滴叫还是哔哔叫
     */
    public abstract void alarm();

    /**
     * 引擎声
     */
    public abstract void engineBoom();

    /**
     *
     */
    public  void run(){
        this.start();
        this.engineBoom();
        if(isAlarm()){
            this.alarm();
        }

        this.stop();
    }

    //钩子方法，默认喇叭是会响的
    protected boolean isAlarm(){
        return true;
    }
}
