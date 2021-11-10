package com.at.designpattern.decorator;

import lombok.Data;

/**
 * @author zero
 * @create 2020-11-18 21:05
 */
@Data
public abstract class Drink {

    private String des;

    private double price = 0.0;

    //计算费用的抽象方法，具体实现交友子类完成
    public abstract double cost();
}
