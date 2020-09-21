package com.gooweb.pattern.singleton;

/**
 * @author steng
 * @description
 * @date 2020-09-02 8:38 上午
 **/
public class Singleton2 {

    private Singleton2(){

    }

    private static class SingletonHandler{
        private static final Singleton2 singleton2 = new Singleton2();
    }

    public static final Singleton2 getInstance(){
       return SingletonHandler.singleton2;
    }
}
