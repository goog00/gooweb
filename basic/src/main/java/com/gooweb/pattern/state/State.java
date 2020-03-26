package com.gooweb.pattern.state;

/**
 * 定义一个抽象的状态类
 * @author steng
 * @description
 * @date 2020-03-23 9:19 上午
 **/
public abstract class State {

    private Context context;

    public void setContext(Context context){
        this.context = context;
    }

    public Context getContext(){
        return context;
    }

    public abstract void handle1();

    public abstract void handle2();


}
