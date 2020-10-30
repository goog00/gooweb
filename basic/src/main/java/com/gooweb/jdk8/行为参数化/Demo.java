package com.gooweb.jdk8.行为参数化;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author steng
 * @description
 * @date 2020-10-29 14:31
 **/
public class Demo {

    /**
     * 常见方案
     *
     * @param apples
     * @return
     */
    private static List<Apple> filterByColor(List<Apple> apples) {
        List<Apple> result = new ArrayList<>();
        if (null != apples && !apples.isEmpty()) {
            for (Apple apple : apples) {
                if ("green".equals(apple.getColor())) {
                    result.add(apple);
                }
            }
        }
        return result;
    }

    /**
     * 将颜色当做参数
     *
     * @param apples
     * @param color
     * @return
     */
    private static List<Apple> filterByColor(List<Apple> apples, String color) {
        List<Apple> result = new ArrayList<>();
        if (null != apples && !apples.isEmpty()) {
            for (Apple apple : apples) {
                if (color.equals(apple.getColor())) {
                    result.add(apple);
                }
            }
        }
        return result;
    }

    /**
     * 根据重量查询
     *
     * @param apples
     * @return
     */
    private static List<Apple> filterByWeight(List<Apple> apples) {
        List<Apple> result = new ArrayList<>();
        if (null != apples && !apples.isEmpty()) {
            for (Apple apple : apples) {
                if (apple.getWeight() > 150) {
                    result.add(apple);
                }
            }
        }
        return result;
    }


    /**
     * 参数行为化,通过策略模板,接收不同的策略实现
     *
     * @param apples
     * @param p
     * @return
     */
    private static List<Apple> filterByCondition(List<Apple> apples, ApplePredicate<Apple> p) {
        List<Apple> result = new ArrayList<>();
        if (null != apples && !apples.isEmpty()) {
            for (Apple apple : apples) {
                if (p.test(apple)) {
                    result.add(apple);
                }
            }
        }
        return result;
    }

    //使用匿名类调用

//    List<Apple> greenApples = filterByCondition(apples, new ApplePredicate<Apple>() {
//        @Override
//        public boolean test(Apple t) {
//            return "green".equals(t.getColor());
//        }
//    });

//    List<Apple> greenApples = filterByCondition(apples, new ApplePredicate<Apple>() {
//        @Override
//        public boolean test(Apple t) {
//            return t.getWeight() > 150;
//        }
//    })

    //lambda 表达式 调用

//    List<Apple> greenApples = filterByCondition(apples,(Apple apple) -> "green".equals(apple.getColor()));
//List<Apple> heavyApples = filterByCondition(apples,(Apple apple) -> apple.getWeight() > 150);

    public static void main(String[] args) {

        //使用匿名类调用
        List<Apple> apples = Arrays.asList(new Apple("green", 100),
                new Apple("red", 190));

        List<Apple> greenApples = filterByCondition(apples, new ApplePredicate<Apple>() {
            @Override
            public boolean test(Apple t) {
                return "green".equals(t.getColor());
            }
        });

        List<Apple> weightApples = filterByCondition(apples, new ApplePredicate<Apple>() {
            @Override
            public boolean test(Apple t) {
                return t.getWeight() > 150;
            }
        });

        //lambda 表达式 调用
        List<Apple> greenAppleslmd = filterByCondition(apples, (Apple apple) -> "green".equals(apple.getColor()));
        List<Apple> heavyApples = filterByCondition(apples, (Apple apple) -> apple.getWeight() > 150);
        //将lambda表达式的参数去掉。
        List<Apple> heavyApples2 = filterByCondition(apples,apple -> apple.getWeight() > 150);



    }


}
