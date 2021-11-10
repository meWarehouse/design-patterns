package com.at.designpattern.factory.absfactory.order;

import com.at.designpattern.factory.Pizza;

/**
 * @author zero
 * @create 2020-11-17 20:47
 */
//一个抽象工厂模式的抽象层(接口)
public interface AbsFactory {

    //让下面的工厂子类来具体实现
    Pizza createPizza(String type);

}
