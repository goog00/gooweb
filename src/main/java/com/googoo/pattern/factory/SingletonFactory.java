package com.googoo.pattern.factory;

import java.lang.reflect.Constructor;

/**
 * @ClassName SingletonFactory
 * @Description TODO
 * @Author sunteng
 * @Date 2018/9/22 20:43
 * @Version 1.0
 **/
public class SingletonFactory {

    private static Singleton singleton;

    static {

        try {
            Class<?> aClass = Class.forName(Singleton.class.getName());
            Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            declaredConstructor.newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Singleton getSingleton(){
        return singleton;
    }
}
