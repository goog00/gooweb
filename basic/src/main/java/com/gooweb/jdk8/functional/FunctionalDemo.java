package com.gooweb.jdk8.functional;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * 函数式编程
 *
 * @author steng
 * @description
 * @date 2020-10-29 13:38
 **/
public class FunctionalDemo {

    static final List<String> stringList = Arrays.asList("hello", "world", "hello", "lambda");

    public void commonTest() {

        for (String string : stringList) {
            System.out.println(string);

        }
    }


    public void oneTest() {
        stringList.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }

    public void twoTest() {
        stringList.forEach((final String s) -> System.out.println(s));
    }

    public void threeTest() {
        stringList.forEach((s) -> System.out.println(s));
    }

    public void fourTest() {
        stringList.forEach(System.out::println);
    }


    //List translate

    public void innerIterTest() {
        List<String> stringList = new LinkedList<>();
        stringList.forEach(s -> stringList.add(s.toUpperCase()));
        System.out.println(stringList);

    }

    public void streamTest() {
        stringList.stream().map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));
    }


    public void methodReferenceTest() {
        stringList.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }


    //Collection filter


    public void filterTest() {
        stringList
                .stream()
                .filter(s -> s.startsWith("g"))
                .forEach(System.out::println);
    }

    static final List<String> colorList = Arrays.asList("red", "green", "hack", "yellow");

    public void reuseLambdaTest() {
        Predicate<String> startWithG = name -> name.startsWith("g");
        stringList.stream().filter(startWithG).forEach(System.out::println);
        colorList.stream().filter(startWithG).forEach(System.out::println);
    }


    /**
     * 查找以 g/w 开头的字符串
     */
    public void filterTest2() {
        final Predicate<String> startsWithG = name -> name.startsWith("g");
        final Predicate<String> startsWithW = name -> name.startsWith("w");
        stringList
                .stream()
                .filter(startsWithG)
                .forEach(System.out::println);
        stringList
                .stream()
                .filter(startsWithW)
                .forEach(System.out::println);
    }

    //场景2

    /**
     * 判断是否以某字符开始
     *
     * @param letter
     * @return
     */
    private static Predicate<String> checkIfStartsWith(final String letter) {
        return name -> name.startsWith(letter);
    }

    public void staticMethodTest() {
        stringList
                .stream()
                .filter(checkIfStartsWith("g"))
                .forEach(System.out::println);
        stringList
                .stream()
                .filter(checkIfStartsWith("w"))
                .forEach(System.out::println);
    }


    /**
     * 使用函数，替换静态方法
     */
    public void functionTest(){
        final Function<String,Predicate<String>> startsWithLetter = (String letter)->{
            Predicate<String> checkStarts = (String name) -> name.startsWith(letter);
            return checkStarts;
        };

        stringList
                .stream()
                .filter(startsWithLetter.apply("g"))
                .forEach(System.out::println);
        stringList
                .stream()
                .filter(startsWithLetter.apply("w"))
                .forEach(System.out::println);

    }


    /**
     * 使用lambda
     */
    public void lambdaFuncTest() {
        final Function<String, Predicate<String>> startsWithLetter =
                (String letter) -> (String name) -> name.startsWith(letter);

        stringList
                .stream()
                .filter(startsWithLetter.apply("g"))
                .forEach(System.out::println);
        stringList
                .stream()
                .filter(startsWithLetter.apply("w"))
                .forEach(System.out::println);
    }

}
