package com.gooweb.pattern.动态代理;

/**
 * @author steng
 * @description
 * @date 2020-08-26 11:20 上午
 **/
public class RealSubject implements Subject {

    @Override
    public String SayHello(String name) {
        return "Hello " + name;
    }

    @Override
    public String SayGoodBye() {
        return " Good bye " ;
    }
}
