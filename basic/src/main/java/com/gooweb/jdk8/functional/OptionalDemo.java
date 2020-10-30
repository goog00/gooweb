package com.gooweb.jdk8.functional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author steng
 * @description
 * @date 2020-10-29 14:04
 **/
public class OptionalDemo {

    static final List<String> stringList = Arrays.asList("hello", "world", "hello", "lambda");


    private static void pickName(final List<String> names,final String startingLetter){

        final Optional<String> foundName = names
                .stream()
                .filter(name->name.startsWith(startingLetter))
                .findFirst();
        System.out.println(String.format("A name starting with %s: %s",startingLetter,foundName.orElse("no name found")));

    }

    public static void main(String[] args) {
        pickName(stringList,"z");
        pickName(stringList,"h");
    }
}
