package com.at.designpattern.decorator;

/**
 * @author zero
 * @create 2020-11-18 21:37
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        setDes("Chocolate");
        setPrice(2.99);
    }
}
