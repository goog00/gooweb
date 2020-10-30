package com.gooweb.jdk8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * lambda 内置函数 Consumer
 * Consumer 定义了一个名为 accept() 的方法。接受泛型 T 的对象，没有返回值(void)。
 * @author steng
 * @description
 * @date 2020-10-29 13:17
 **/
public class ConsumerDemo {

    /**
     * 循环执行
     * @param list
     * @param consumer
     * @param <T>
     */
    private static <T> void  foreach(List<T> list, Consumer<T> consumer){

        for(T t : list){
            consumer.accept(t);
        }

    }

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A", "", "C", "Dog", "Delete");
        foreach(stringList,(String s)-> System.out.println(s));
    }

}
