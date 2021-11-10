package com.at.designpattern.strategy.impr;

/**
 * @author zero
 * @create 2020-11-21 15:44
 */
public class GaGaQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("GA GA Quack");
    }
}
