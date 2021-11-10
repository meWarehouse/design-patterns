package com.at.designpattern.factory.absfactory.order;


/**
 * @author zero
 * @create 2020-11-17 19:00
 */
public class PizzaStore {
    public static void main(String[] args) {

        new OrderPizza(new LDFactory());

    }
}
