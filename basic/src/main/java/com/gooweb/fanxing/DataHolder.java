package com.gooweb.fanxing;

/**
 * @author steng
 * @description
 * @date 2020-03-10 9:24 下午
 **/
public class DataHolder<T> {

    private T item;

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return item;
    }

    //<E> 声明为泛型方法
    public <E> void printInfo(E e){
        System.out.println(e);
    }
}
