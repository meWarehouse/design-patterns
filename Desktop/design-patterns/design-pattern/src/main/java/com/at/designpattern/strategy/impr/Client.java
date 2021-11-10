package com.at.designpattern.strategy.impr;

import sun.awt.image.ImageCache;

/**
 * @author zero
 * @create 2020-11-21 15:50
 */
public class Client {
    public static void main(String[] args) {

        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();
        wildDuck.quack();
        wildDuck.swim();


        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();
        toyDuck.quack();
        toyDuck.swim();

        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.fly();
        pekingDuck.quack();
        pekingDuck.swim();

    }
}
