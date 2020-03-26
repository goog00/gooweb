package com.gooweb.pattern.state;

/**
 * @author steng
 * @description
 * @date 2020-03-23 11:00 上午
 **/
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setCurrentState(new ConcreteStateA());
        context.handle1();
        context.handle2();
    }
}
