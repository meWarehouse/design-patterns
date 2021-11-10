package com.at.designpattern.strategy.impr;


/**
 * @author zero
 * @create 2020-11-21 14:41
 */
public class ToyDuck extends Duck {

    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();
        quackBehavior = new NoQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("ToyDuck");
    }

    public void swim(){
        System.out.println("ToyDuck not.. swim ...");
    }


}
