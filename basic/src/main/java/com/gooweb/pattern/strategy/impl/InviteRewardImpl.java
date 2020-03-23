package com.gooweb.pattern.strategy.impl;

/**
 * @author steng
 * @description
 * @date 2020-03-23 10:13 上午
 **/
public class InviteRewardImpl {

    public void sendReward(long userId){
        FactorRewardStrategyFactory factorRewardStrategyFactory = new FactorRewardStrategyFactory();
        //
        RewardStrategy newUserRewardStrategy = factorRewardStrategyFactory.createReward(NewUserRewardStrategyA.class);
        RewardContext rewardContext = new RewardContext(newUserRewardStrategy);
        rewardContext.doReward(userId);

    }
}
