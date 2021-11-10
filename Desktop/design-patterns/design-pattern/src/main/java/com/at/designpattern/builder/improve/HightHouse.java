package com.at.designpattern.builder.improve;

/**
 * @author zero
 * @create 2020-11-18 10:33
 *
 * 具体的建造
 *
 */
public class HightHouse extends HouseBulider {
    @Override
    public void buildBase() {
        System.out.println("BigHouse --》 buildBse");
    }

    @Override
    public void buildWalls() {
        System.out.println("BigHouse --》 buildBse");
    }

    @Override
    public void roofed() {
        System.out.println("BigHouse --》 buildBse");
    }
}
