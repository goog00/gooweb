package com.gooweb.jdk8.stream;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 1.使用集合生成流
 * 2.数值范围创建数值流
 * 3.值序列,数组,文件,函数 创建流
 *
 * @author steng
 * @description
 * @date 2020-10-30 11:16
 **/
public class BuildStreamDemo {


    //数值流
    //原始类型流特化 IntStream、 DoubleStream 和 LongStream ，分别将流中的元素特化为 int 、 long 和 double ，

//    int calories = menu.stream()
//            // 返回一个IntStream
//            .mapToInt(Dish::getCalories)
//            .sum();
    //IntStream intStream = menu.stream().mapToInt(Dish::getCalories);
    //    Stream<Integer> stream = intStream.boxed();


    //数值范围

    /**
     * 比如，假设你想要生成1和100之间的所有数字。
     * <p>
     * Java 8引入了两个可以用于 IntStream 和 LongStream 的静态方法，帮助生成这种范围：range 和 rangeClosed 。
     * <p>
     * 这两个方法都是第一个参数接受起始值，第二个参数接受结束值。
     * <p>
     * 但range 是不包含结束值的，而 rangeClosed 则包含结束值。
     */

    @Test
    public void test() {

        // 一个从1到100的偶数流 包含结束值
        IntStream evenNumbers = IntStream.rangeClosed(1, 100)
                .filter(n -> n % 2 == 0);
        // 从1到100共有50个偶数
        System.out.println(evenNumbers.count());

    }


    ///构建流
    //1.由值创建流

    @Test
    public void test2() {
        Stream<String> stream = Stream.of("Java 8 ", "Lambdas ", "In ", "Action");
        stream.map(String::toUpperCase).forEach(System.out::println);
    }

    /**
     * 空流
     */
    Stream<String> emptyStream = Stream.empty();

    /**
     * 由数组创建流
     */
    @Test
    public void test3() {
        int[] numbers = {2, 3, 5, 7, 11, 13};
        // 总和41
        int sum = Arrays.stream(numbers).sum();
    }


    /**
     * 由文件生成流
     */

    public void test4() {

        long uniqueWords;
        try (Stream<String> lines = Files.lines(Paths.get(ClassLoader.getSystemResource("data.txt").toURI()),
                Charset.defaultCharset())) {
            uniqueWords = lines.flatMap(line -> Arrays.stream(line.split(" ")))
                    .distinct()
                    .count();
            System.out.println("uniqueWords:" + uniqueWords);
        } catch (IOException e) {
            e.fillInStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }

    /**
     * 由函数生成流：创建无限流
     *
     * Stream API提供了两个静态方法来从函数生成流： Stream.iterate() 和 Stream.generate()。
     *
     * 这两个操作可以创建所谓的无限流：不像从固定集合创建的流那样有固定大小的流。
     *
     * 由 iterate 和 generate 产生的流会用给定的函数按需创建值，因此可以无穷无尽地计算下去！
     *
     * 一般来说，应该使用 limit(n) 来对这种流加以限制，以避免打印无穷多个值。
     */


    /**
     * 1.迭代
     */
    @Test
    public void test5(){
        Stream.iterate(0, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);
    }

    /**
     * 2.生成
     */
    @Test
    public void test6(){
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);
    }



}
