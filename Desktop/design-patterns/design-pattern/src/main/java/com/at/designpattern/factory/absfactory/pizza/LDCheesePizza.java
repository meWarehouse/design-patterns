package com.at.designpattern.factory.absfactory.pizza;

import com.at.designpattern.factory.Pizza;

/**
 * @author zero
 * @create 2020-11-17 20:12
 */
public class LDCheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("LDCheesePizza 准备材料");
    }
}
