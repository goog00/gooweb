package com.gooweb.pattern.state;

/**
 * 定义一个上下文管理容器
 * @author steng
 * @description
 * @date 2020-03-23 9:20 上午
 **/
public class Context {

    public final static ConcreteStateA conA = new ConcreteStateA();

    public final static ConcreteStateB conB = new ConcreteStateB();

    private State currentState;

    public State getCurrentState(){
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        this.currentState.setContext(this);
    }


    public void handle1(){
        this.currentState.handle1();
    }

    public void handle2(){
        this.currentState.handle2();
    }
}
