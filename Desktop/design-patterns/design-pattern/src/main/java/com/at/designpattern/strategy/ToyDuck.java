package com.at.designpattern.strategy;

/**
 * @author zero
 * @create 2020-11-21 14:41
 */
public class ToyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("ToyDuck");
    }

    public void quack(){
        System.out.println("ToyDuck not.. quack ...");
    }
    public void swim(){
        System.out.println("ToyDuck not.. swim ...");
    }
    public void fly(){
        System.out.println("ToyDuck not.. fly ...");
    }


}
