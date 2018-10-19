package com.googoo.common.fanxing;

/**
 * @author sunteng
 * @create 2018-10-18 下午 12:43
 **/
public class Box<T> {
    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }


    public static void main(String[] args) {
        Box box = new Box();
        box.setObject(new Apple());

        Apple object = (Apple) box.getObject();

        Box<Apple> box1 = new Box<>();
        Apple apple = box1.getObject();

    }
}
