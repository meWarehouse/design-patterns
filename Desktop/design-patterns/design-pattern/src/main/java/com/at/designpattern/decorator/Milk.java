package com.at.designpattern.decorator;

/**
 * @author zero
 * @create 2020-11-18 21:29
 */
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDes("Milk");
        setPrice(2.00);
    }
}
