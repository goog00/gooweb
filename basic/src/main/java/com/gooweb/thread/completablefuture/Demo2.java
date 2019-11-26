package com.gooweb.thread.completablefuture;

import java.util.concurrent.CompletableFuture;

/**
 * @author sunteng
 * @create 2019-09-08 下午 3:54
 **/
public class Demo2 {

    public static void main(String[] args) {
        CompletableFuture<String> f0 = CompletableFuture.supplyAsync(()->"Hello , World")
                .thenApply(s-> s + "QQ")
                .thenApply(String::toUpperCase);

        System.out.println(f0.join());
//        System.out.println(f0.get());

    }
}
