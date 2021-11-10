package com.at.designpattern.factory.simplefactory.pizza;

import com.at.designpattern.factory.Pizza;

/**
 * @author zero
 * @create 2020-11-17 19:16
 */
public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("PepperPizza 准备材料");
    }
}
