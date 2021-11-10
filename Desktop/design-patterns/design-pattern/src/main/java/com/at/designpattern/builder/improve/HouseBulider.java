package com.at.designpattern.builder.improve;

import javax.xml.transform.Source;

/**
 * @author zero
 * @create 2020-11-18 10:30
 * <p>
 * 建造者
 */
public abstract class HouseBulider {

    //聚合关系
    House house = null;

    public abstract void buildBase();

    public abstract void buildWalls();

    public abstract void roofed();

    //建造完成就返回 house
    public House buildHouse() {
        System.out.println("house 建造完成现在交付");
        return house;
    }

}

