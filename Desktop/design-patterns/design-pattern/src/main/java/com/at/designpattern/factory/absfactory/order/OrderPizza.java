package com.at.designpattern.factory.absfactory.order;

import com.at.designpattern.factory.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zero
 * @create 2020-11-17 20:53
 */
public class OrderPizza {

    AbsFactory absFactory;

    public void createFactory(AbsFactory absFactory) {
        this.absFactory = absFactory;

        do {
            String type = getType();

            Pizza pizza = absFactory.createPizza(type);

            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("pizza 失败..................");
                break;
            }

        } while (true);

    }

    public OrderPizza(AbsFactory absFactory) {
        createFactory(absFactory);
    }

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
