package com.gooweb.pattern.timegeek.template;

/**
 * @author steng
 * @description
 * @date 2020-06-05 3:30 下午
 **/
public class ShutdownHookDemo {

    private static class ShutdownHook extends Thread{
        public void run(){
            System.out.println("I am called during shutting down");
        }
    }

    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new ShutdownHook());
    }
}
