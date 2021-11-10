package com.at.designpattern.strategy;

/**
 * @author zero
 * @create 2020-11-21 14:41
 */
public class PekingDuck extends Duck {
    @Override
    public void display() {
        System.out.println("WildDuck");
    }

    @Override
    public void fly() {
        System.out.println("PekingDuck not fly .... ");
    }
}
