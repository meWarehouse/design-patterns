package com.at.designpattern.strategy.impr;


/**
 * @author zero
 * @create 2020-11-21 14:41
 */
public class WildDuck extends Duck {

    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
        quackBehavior = new GaGaQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("WildDuck");
    }
}
