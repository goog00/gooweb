package com.gooweb.pattern.factory;

/**
 * @author steng
 * @description
 * @date 2020-03-23 9:44 上午
 **/
public abstract class Factory<T> {

    public abstract Product createProduct(Class<T> clzz) throws ClassNotFoundException, Exception;
}
