package com.gooweb.pattern.strategy.impl;

/**
 * @author steng
 * @description
 * @date 2020-03-23 10:05 上午
 **/
public abstract class StrategyFactory<T> {

    abstract  T createReward(Class<? extends T> clazz) ;

}
