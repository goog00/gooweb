package com.gooweb.test.test2;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        StringBuffer stringBuilder = new StringBuffer();
        for (int i = 0; i < 10000; i++){
            new Thread(() -> {
                for (int j = 0; j < 1000; j++){
                    stringBuilder.append("a");
                }
            }).start();
        }

        Thread.sleep(100L);
        System.out.println(stringBuilder.length());
    }
}