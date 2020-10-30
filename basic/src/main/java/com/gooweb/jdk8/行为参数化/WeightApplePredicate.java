package com.gooweb.jdk8.行为参数化;

/**
 * 重量策略
 * @author steng
 * @description
 * @date 2020-10-29 14:34
 **/
public class WeightApplePredicate implements ApplePredicate<Apple> {


    @Override
    public boolean test(Apple t) {
        return t.getWeight() > 150;
    }
}
