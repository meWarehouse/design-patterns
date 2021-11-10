package com.at.designpattern.factory.factorymethod.pizza;

import com.at.designpattern.factory.Pizza;

/**
 * @author zero
 * @create 2020-11-17 20:12
 */
public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("BJCheesePizza 准备材料");
    }
}
