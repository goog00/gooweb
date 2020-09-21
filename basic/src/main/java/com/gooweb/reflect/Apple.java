package com.gooweb.reflect;

import com.gooweb.pattern.duty.Application;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author steng
 * @description
 * @date 2020-06-19 11:23 上午
 **/
public class Apple {

    private String name;

    public int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public void setName(String name){
        this.name = name;
    }


    public static void main(String[] args) throws Exception {
        //
        Apple apple = new Apple();
        apple.setPrice(5);
        System.out.println("apple price : " + apple.getPrice());

        //反射

        Class<?> aClass = Class.forName("com.gooweb.reflect.Apple");
        Method setPriceMethod = aClass.getMethod("setPrice", int.class);
        Constructor<?> constructor = aClass.getConstructor();
        Object appleObject = constructor.newInstance();

        setPriceMethod.invoke(appleObject, 15);
        Method getPriceMethod = aClass.getMethod("getPrice");
        Object price = getPriceMethod.invoke(appleObject);
        System.out.println("apple price :" + price);


        //获取公有的字段
        Field[] fields = aClass.getFields();
        //获取类所有的字段:私有的,公有的
        Field[] declaredFields = aClass.getDeclaredFields();
        for(Field field : declaredFields){
            System.out.println(field);
        }


        Class<?> HelloController = Class.forName("com.googoo.controller.demo.HelloController");

        Method setName = HelloController.getMethod("update", HttpServletRequest.class,String.class);
        Class<?>[] parameterTypes = setName.getParameterTypes();

        for(Class clz : parameterTypes){
            System.out.println(clz);
        }


    }
}
