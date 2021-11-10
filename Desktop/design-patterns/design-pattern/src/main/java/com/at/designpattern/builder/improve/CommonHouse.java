package com.at.designpattern.builder.improve;

/**
 * @author zero
 * @create 2020-11-18 10:33
 *
 * 具体的建造
 *
 */
public class CommonHouse extends HouseBulider {
    @Override
    public void buildBase() {
        System.out.println("普通House --》 buildBse");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通House --》 buildBse");
    }

    @Override
    public void roofed() {
        System.out.println("普通House --》 buildBse");
    }
}
