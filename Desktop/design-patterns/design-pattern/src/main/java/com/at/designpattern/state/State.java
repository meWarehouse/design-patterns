package com.at.designpattern.state;

/**
 * 状态抽象类
 */
public interface State {

    //扣除积分 - 50
    default void deductMoney() {
    }

    // 是否抽中奖品
    default boolean raffle() {
        return false;
    }


    //发放奖品
    default void dispensePrize() {
    }

}
