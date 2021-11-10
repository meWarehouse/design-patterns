package com.at.designpattern.strategy.impr;

/**
 * @author zero
 * @create 2020-11-21 15:44
 */
public class NoQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("No Quack");
    }
}
