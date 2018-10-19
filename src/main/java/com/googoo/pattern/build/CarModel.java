package com.googoo.pattern.build;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * cardmodel
 *
 * @author sunteng
 * @create 2018-10-14 下午 9:48
 **/
public abstract class CarModel {

    //这个参数是各个方法的执行顺序
    private ArrayList<String> sequence = new ArrayList<>();

    //模型是启动开始跑了
    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run(){

        for(int i =0; i < this.sequence.size(); i++){
            String actionName = this.sequence.get(i);
            if(actionName.equalsIgnoreCase("start")){
                this.start();
            } else if (actionName.equalsIgnoreCase("stop")){
                this.stop();
            } else if (actionName.equalsIgnoreCase("alarm")){
                this.alarm();
            } else if (actionName.equalsIgnoreCase("engineBoom")){
                this.engineBoom();
            }
        }
    }

    final public void setSequence(ArrayList sequence){
        this.sequence = sequence;
    }
}
