package com.at.designpattern.factory.factorymethod.order;

import com.at.designpattern.factory.Pizza;
import com.at.designpattern.factory.factorymethod.pizza.LDCheesePizza;
import com.at.designpattern.factory.factorymethod.pizza.LDPepperPizza;

/**
 * @author zero
 * @create 2020-11-17 20:17
 */
public class LDOrderPizza extends OrderPizza {

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
