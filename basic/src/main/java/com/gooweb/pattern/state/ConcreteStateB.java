package com.gooweb.pattern.state;

import com.google.common.eventbus.EventBus;

/**
 * @author steng
 * @description
 * @date 2020-03-23 10:54 上午
 **/
public class ConcreteStateB extends State {
    @Override
    public void handle1() {
        //切换到状态A
        super.getContext().setCurrentState(Context.conA);
        //执行状态A的任务
        super.getContext().handle2();

    }

    @Override
    public void handle2() {
        //这个状态下 必须要处理的事情

    }
}
