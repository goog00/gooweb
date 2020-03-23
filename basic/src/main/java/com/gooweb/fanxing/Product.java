package com.gooweb.fanxing;

/**
 * @author steng
 * @description
 * @date 2020-03-01 7:19 上午
 **/
public class Product<T> {

    public <F extends Factory<T>> Product(F factory){
        factory.create();
    }
}
