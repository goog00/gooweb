package com.gooweb.jdk8.lambda;

import jdk.internal.org.objectweb.asm.tree.IincInsnNode;
import org.omg.CORBA.INTERNAL;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

/**
 * 内置函数Function
 * @author steng
 * @description
 * @date 2020-10-29 13:20
 **/
public class FunctionDemo {

    /**
     * 将一种元素按照规则映射成为另外一种元素
     * @param list
     * @param function
     * @param <T>
     * @param <R>
     * @return
     */
    public static <T,R> List<R> map(List<T> list, Function<T,R> function){

        List<R> result = new LinkedList<>();

        for(T t : list){
            result.add(function.apply(t));
        }
        return result;
    }



    public static void test(){
        Function<Integer, Integer> f = x->x+1;
        Function<Integer,Integer> g = x->x*2;
        Function<Integer,Integer> h = f.andThen(g);
        int result = h.apply(1);
        System.out.println(result);
    }

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("A", "", "C", "Dog", "Delete");

        List<String> result = map(stringList, (String s)->s.toLowerCase());
        List<String> result2 = map(stringList, String::toLowerCase);


        System.out.println(result);

        test();


    }
}
