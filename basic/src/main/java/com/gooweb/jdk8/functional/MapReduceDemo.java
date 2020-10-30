package com.gooweb.jdk8.functional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author steng
 * @description
 * @date 2020-10-29 14:13
 **/
public class MapReduceDemo {

    static final List<String> stringList = Arrays.asList("hello", "world", "hello", "lambda");


    /**
     * 计算全部字符串的长度之和
     */
    public void sumTest() {
        int total = stringList.stream().mapToInt(s -> s.length()).sum();
        System.out.println(total);
    }

    /**
     * 找到最长的一个字符串
     */
    public void longestTest() {
        final Optional<String> aLongName = stringList
                .stream()
                .reduce((name1, name2) ->
                        name1.length() >= name2.length() ? name1 : name2);
        aLongName.ifPresent(name ->
                System.out.println(String.format("A longest name: %s", name)));
    }

    /**
     * 列表内容进行拼接
     */
    public void joinTest() {
        String string = stringList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));
        System.out.println(string);
    }

    public static void main(String[] args) {
        MapReduceDemo mapReduceDemo = new MapReduceDemo();
        mapReduceDemo.joinTest();
        mapReduceDemo.sumTest();
        mapReduceDemo.longestTest();
    }
}
