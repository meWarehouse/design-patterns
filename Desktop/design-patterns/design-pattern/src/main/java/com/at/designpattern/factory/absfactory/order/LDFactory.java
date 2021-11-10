package com.at.designpattern.factory.absfactory.order;


import com.at.designpattern.factory.Pizza;
import com.at.designpattern.factory.absfactory.pizza.LDCheesePizza;
import com.at.designpattern.factory.absfactory.pizza.LDPepperPizza;

/**
 * @author zero
 * @create 2020-11-17 20:48
 */
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        //LD
        if (type.equals("cheese")) {
            pizza = new LDCheesePizza();
            pizza.setName("LDCheesePizza");
        } else if (type.equals("pepper")) {
            pizza = new LDPepperPizza();
            pizza.setName("LDPepperPizza");
        }

        return pizza;
    }
}
