package com.at.designpattern.state;

import java.util.Random;

//可以抽奖的状态
public class CanRaffleState implements State {

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

//    //已经扣除过积分，当前状态无需再扣除积分
//    @Override
//    public void deductMoney() {
//        System.out.println("已经扣除过积分，当前状态无需再扣除积分");
//    }

    //可以抽奖，抽完奖后根据情况改成新的状态
    @Override
    public boolean raffle() {
        System.out.println("正在抽奖，请稍候！！！");
        Random r = new Random();
        int num = r.nextInt(10);
        // 10%中奖机会
        if (num == 0) {
            // 改变活动状态为发放奖品 context
            activity.setState(activity.getDispenseState());
            return true;
        } else {
            System.out.println("很遗憾没有抽中奖品！");
            // 改变状态为不能抽奖
            activity.setState(activity.getNoRafflleState());
            return false;
        }
    }

//    // 不能发放奖品
//    @Override
//    public void dispensePrize() {
//        System.out.println("没中奖，不能发放奖品");
//    }
}
