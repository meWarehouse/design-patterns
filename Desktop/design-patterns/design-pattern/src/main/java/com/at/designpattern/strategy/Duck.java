package com.at.designpattern.strategy;

/**
 * @author zero
 * @create 2020-11-21 14:39
 */
public abstract class Duck {

    public Duck() {
    }

    public void quack() {
        System.out.println("Duck .. quack ...");
    }

    public void swim() {
        System.out.println("Duck .. swim ...");
    }

    public void fly() {
        System.out.println("Duck .. fly ...");
    }

    public abstract void display();

}
