package com.gooweb.pattern.state;

/**
 * @author steng
 * @description
 * @date 2020-03-23 10:54 上午
 **/
public class ConcreteStateA extends State {
    @Override
    public void handle1() {
        //这个状态下 必须要处理的事情
        System.out.println("状态A必须要处理的问题");
    }

    @Override
    public void handle2() {
        //切换到状态B
        super.getContext().setCurrentState(Context.conB);
        super.getContext().handle1();

    }
}
