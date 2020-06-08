package com.gooweb.pattern.duty;

/**
 * @author steng
 * @description
 * @date 2020-04-15 12:14 下午
 **/
public class Application {

    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}
