package com.at.designpattern.factory.factorymethod.order;

import com.at.designpattern.factory.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

;

/**
 * @author zero
 * @create 2020-11-17 18:53
 */
public abstract class OrderPizza {

    //定义一个抽象方法，createPizza , 让各个工厂子类自己实现
    public abstract Pizza createPizza(String type);

    public OrderPizza() {

        do {
            String type = getType();

            //定义一个抽象方法，createPizza , 让各个工厂子类自己实现
            Pizza pizza = createPizza(type);

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
