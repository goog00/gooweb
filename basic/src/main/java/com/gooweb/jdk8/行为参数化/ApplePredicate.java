package com.gooweb.jdk8.行为参数化;

/**
 * 策略接口
 * @author steng
 * @description
 * @date 2020-10-29 14:33
 **/
public interface ApplePredicate<Apple> {

    boolean test(Apple t);
}
