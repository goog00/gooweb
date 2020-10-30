package com.gooweb.jdk8.lambda;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * lambda 内置函数Predicate
 * @author steng
 * @description
 * @date 2020-10-29 13:13
 **/
public class PredicateDemo {

    /**
     * 过滤器: 返回满足条件的列表
     * @param list
     * @param predicate
     * @param <T>
     * @return
     */
    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new LinkedList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A", "", "C", "Dog", "Delete");

        List<String> result = filter(stringList, (String s) -> s.startsWith("D"));
        System.out.println(result);
    }


}
