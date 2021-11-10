package com.at.designpattern.strategy.impr;


/**
 * @author zero
 * @create 2020-11-21 14:41
 */
public class PekingDuck extends Duck {

    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();
        quackBehavior = new GaGaQuackBehavior();
    }


    @Override
    public void display() {
        System.out.println("PekingDuck");
    }

}
