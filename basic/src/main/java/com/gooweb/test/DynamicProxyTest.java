package com.gooweb.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

/**
 * @author steng
 * @description
 * @date 2020-03-13 4:56 下午
 **/
public class DynamicProxyTest {


    public static String test(List<Integer> list){
        return null;
    }

    public static  int test2(List<String> list){
        return 0;
    }



    interface IHello {
        void sayHello();
    }

    static class Hello implements IHello{

        @Override
        public void sayHello() {
            System.out.println("hello world");
        }
    }

    static class DynamicProxy implements InvocationHandler{

        Object originObj;

        Object bind(Object originObj){
            this.originObj = originObj;
            return Proxy.newProxyInstance(originObj.getClass().getClassLoader(),originObj.getClass().getInterfaces(),this);
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("welcome");
            return method.invoke(originObj,args);
        }
    }

    public static void main(String[] args) {
        IHello hello = (IHello) new DynamicProxy().bind(new Hello());
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

        hello.sayHello();

        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        System.out.println(c == d);//true
        System.out.println(e == f);// false
        System.out.println(c == (a + b)); // true
        System.out.println(c.equals(a + b)); // true
        System.out.println(g == (a + b)); // true
        System.out.println(g.equals(a + b)); //false
    }
}
