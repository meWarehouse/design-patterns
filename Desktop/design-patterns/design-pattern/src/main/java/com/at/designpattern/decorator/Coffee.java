package com.at.designpattern.decorator;

/**
 * @author zero
 * @create 2020-11-18 21:08
 */
public class Coffee extends Drink {

    @Override
    public double cost() {
        return super.getPrice();
    }
}
