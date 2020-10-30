package com.gooweb.jdk8.stream;

import java.util.function.Function;

/**
 * @author steng
 * @description
 * @date 2020-10-29 15:03
 **/
public class StreamDemo {

    public static long measurePerf(Function<Long, Long> adder, long n) {
        long fastest = Long.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            long sum = adder.apply(n);
            long duration = (System.nanoTime() - start) / 1_000_000;
            System.out.println("Result: " + sum);
            if (duration < fastest) {
                fastest = duration;
            }
        }
        return fastest;
    }

    public static void main(String[] args) {


//        System.out.println("Sequential sum done in:" + measurePerf(ParallelStreams::sequentialSum, 10_000_000) + " msecs");

    }
}
