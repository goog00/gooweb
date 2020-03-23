package com.gooweb.pattern.strategy;

/**
 * @author steng
 * @description
 * @date 2020-03-23 9:53 上午
 **/
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void doStrategy(Strategy strategy){
        strategy.strategyImpl();
    }
}
