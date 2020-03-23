package com.gooweb.pattern.strategy;

/**
 * @author steng
 * @description
 * @date 2020-03-23 9:55 上午
 **/
public class StrategyA implements Strategy {

    @Override
    public void strategyImpl() {
        System.out.println("具体执行策略的方法");
    }
}
