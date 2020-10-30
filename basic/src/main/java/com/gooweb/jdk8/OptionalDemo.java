package com.gooweb.jdk8;

import java.util.Optional;

/**
 * @author steng
 * @description
 * @date 2020-10-29 11:25
 **/
public class OptionalDemo {


    public void nullTest(){
        Optional<String> fullName = Optional.ofNullable(null);
        System.out.println("Full Name is set ? " + fullName.isPresent());
        System.out.println("Full Name  " + fullName.orElseGet(()->"[none"));
        System.out.println(fullName.map(s->"Hey " + s + "!").orElse("Hey Stranger!"));
    }


    public void notNullTest() {
        Optional< String > fullName = Optional.ofNullable( "ryo" );
        System.out.println( "Full Name is set? " + fullName.isPresent() );
        System.out.println( "Full Name: " + fullName.orElseGet( () -> "[none]" ) );
        System.out.println( fullName.map( s -> "Hey " + s + "!" ).orElse( "Hey Stranger!" ) );
    }

    public static void main(String[] args) {
        OptionalDemo optionalDemo = new OptionalDemo();
        optionalDemo.nullTest();
        optionalDemo.notNullTest();
    }
}
