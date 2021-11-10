package com.at.designpattern.decorator;

/**
 * @author zero
 * @create 2020-11-18 21:29
 */
public class Soy extends Decorator {
    public Soy(Drink drink) {
        super(drink);
        setDes("Soy");
        setPrice(1.00);
    }
}
