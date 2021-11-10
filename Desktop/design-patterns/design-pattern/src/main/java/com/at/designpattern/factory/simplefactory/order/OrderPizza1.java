package com.at.designpattern.factory.simplefactory.order;

import com.at.designpattern.factory.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zero
 * @create 2020-11-17 18:53
 */
public class OrderPizza1 {

    public OrderPizza1() {

        do {
            String type = getType();
            Pizza pizza = SimpleFactory.createPizza2(type);
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
