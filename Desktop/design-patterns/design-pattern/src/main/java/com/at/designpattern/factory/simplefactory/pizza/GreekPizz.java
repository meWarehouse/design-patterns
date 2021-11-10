package com.at.designpattern.factory.simplefactory.pizza;

import com.at.designpattern.factory.Pizza;

/**
 * @author zero
 * @create 2020-11-17 18:51
 */
public class GreekPizz extends Pizza {
    @Override
    public void prepare() {
        System.out.println("GreekPizz 准备原材料");
    }
}
