package com.at.designpattern.strategy.impr;

/**
 * @author zero
 * @create 2020-11-21 15:42
 */
public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println(" good FlyBehavior");
    }
}
