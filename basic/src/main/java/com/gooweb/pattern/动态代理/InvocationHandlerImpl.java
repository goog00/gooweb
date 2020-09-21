package com.gooweb.pattern.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author steng
 * @description
 * @date 2020-08-26 11:21 上午
 **/
public class InvocationHandlerImpl implements InvocationHandler {


    private Object subject;

    public InvocationHandlerImpl(Object subject){
        this.subject = subject;
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("调用之前。。。。");
        System.out.println("执行的方法Method = " + method);
        Object returnValue = method.invoke(subject, args);

        System.out.println("调用之后。。。。");

        return returnValue;
    }
}
