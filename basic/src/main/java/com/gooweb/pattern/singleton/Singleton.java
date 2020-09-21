package com.gooweb.pattern.singleton;


/**
 * @author steng
 * @description
 * @date 2020-09-02 8:34 上午
 **/
public class Singleton {

    private Singleton(){};

    private static volatile Singleton singleton = null;

    public static Singleton getInstance(){

        if(singleton == null){
            synchronized(Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }

            }
        }
        return singleton;
    }
}
