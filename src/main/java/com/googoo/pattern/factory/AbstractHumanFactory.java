package com.googoo.pattern.factory;

/**
 * @ClassName AbstractHumanFactory
 * @Description TODO
 * @Author sunteng
 * @Date 2018/9/22 20:20
 * @Version 1.0
 **/
public abstract class AbstractHumanFactory {

    public abstract <T extends Human> T createHuman(Class<T> c);
}
