package com.gooweb.pattern.strategy.impl;

/**
 * @author steng
 * @description
 * @date 2020-03-23 10:06 上午
 **/
public class FactorRewardStrategyFactory extends StrategyFactory<RewardStrategy> {

    @Override
    RewardStrategy createReward(Class<? extends RewardStrategy> clazz) {
        RewardStrategy rewardStrategy = null;
        try {
            rewardStrategy = (RewardStrategy) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rewardStrategy;
    }


}
