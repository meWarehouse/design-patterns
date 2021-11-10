package com.at.designpattern.factory.simplefactory.order;

import com.at.designpattern.factory.simplefactory.pizza.CheesePizz;
import com.at.designpattern.factory.Pizza;


/**
 * @author zero
 * @create 2020-11-17 19:20
 */
public class SimpleFactory {

    public Pizza createPizza(String type) {
        System.out.println("~~简单工厂模式~~");
        Pizza pizza = null;
        if (type.equals("cheek")) {
            pizza = new CheesePizz();
            pizza.setName(type);
        } else if (type.equals("cheese")) {
            pizza = new CheesePizz();
            pizza.setName(type);
        } else if (type.equals("pepper")) {
            pizza = new CheesePizz();
            pizza.setName(type);
        }

        return pizza;
    }

    public static Pizza createPizza2(String type) {
        System.out.println("~~简单工厂模式~~");
        Pizza pizza = null;
        if (type.equals("cheek")) {
            pizza = new CheesePizz();
            pizza.setName(type);
        } else if (type.equals("cheese")) {
            pizza = new CheesePizz();
            pizza.setName(type);
        } else if (type.equals("pepper")) {
            pizza = new CheesePizz();
            pizza.setName(type);
        }

        return pizza;
    }

}
