package com.gooweb.pattern.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author steng
 * @description
 * @date 2020-08-26 11:27 上午
 **/
public class DynamicProxyDemonstration {

    public static void main(String[] args) {
        Subject subject = new RealSubject();

        InvocationHandler handler = new InvocationHandlerImpl(subject);

        ClassLoader classLoader = subject.getClass().getClassLoader();
        Class<?>[] interfaces = subject.getClass().getInterfaces();

        Subject proxySubject = (Subject) Proxy.newProxyInstance(classLoader, interfaces, handler);

        String sunteng = proxySubject.SayHello("sunteng");
        System.out.println(sunteng);

    }
}
