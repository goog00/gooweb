package com.gooweb.pattern.strategy.impl;

/**
 * @author steng
 * @description
 * @date 2020-03-23 10:06 上午
 **/
public class RewardContext {

    private RewardStrategy rewardStrategy;

    public RewardContext(RewardStrategy rewardStrategy){
        this.rewardStrategy = rewardStrategy;
    }

    public void doReward(Long userId){
        rewardStrategy.reward(userId);
//        insertRewardAndSettlement(long userId, int reward) {
//            insertReward(userId, rewardMoney);
//            settlement(userId);
//        }
    }
}
