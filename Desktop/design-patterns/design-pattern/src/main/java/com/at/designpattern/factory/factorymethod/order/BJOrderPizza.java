package com.at.designpattern.factory.factorymethod.order;

import com.at.designpattern.factory.Pizza;
import com.at.designpattern.factory.factorymethod.pizza.BJCheesePizza;
import com.at.designpattern.factory.factorymethod.pizza.BJPepperPizza;

/**
 * @author zero
 * @create 2020-11-17 20:17
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        //北京的
        if (type.equals("cheese")) {
            pizza = new BJCheesePizza();
            pizza.setName("BJCheesePizza");
        } else if (type.equals("pepper")) {
            pizza = new BJPepperPizza();
            pizza.setName("BJPepperPizza");
        }

        return pizza;
    }
}
