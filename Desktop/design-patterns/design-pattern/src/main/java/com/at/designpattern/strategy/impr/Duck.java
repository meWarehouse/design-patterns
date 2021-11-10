package com.at.designpattern.strategy.impr;

/**
 * @author zero
 * @create 2020-11-21 14:39
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public void quack(){
        if(quackBehavior != null){
            quackBehavior.quack();
        }
    }
    public void swim(){
        System.out.println("Duck .. swim ...");
    }
    public void fly(){
        if(flyBehavior != null){
            flyBehavior.fly();
        }
    }

    public abstract void display();

}
