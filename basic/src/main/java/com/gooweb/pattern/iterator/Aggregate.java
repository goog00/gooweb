package com.gooweb.pattern.iterator;

/**
 * 聚合对象的接口，定义创建相应迭代器对象的接口
 * @author sunteng
 * @create 2019-11-02 上午 10:55
 **/
public abstract class Aggregate {

    public abstract Iterator createIterator();

}
