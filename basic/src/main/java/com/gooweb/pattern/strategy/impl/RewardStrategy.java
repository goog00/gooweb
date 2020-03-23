package com.gooweb.pattern.strategy.impl;

/**
 * @author steng
 * @description 抽象返奖策略
 * @date 2020-03-23 9:58 上午
 **/
public abstract class RewardStrategy {

    public abstract void reward(Long userId);

    public void insertRewardAndSettlement(Long userId,int reward){

    }


}
