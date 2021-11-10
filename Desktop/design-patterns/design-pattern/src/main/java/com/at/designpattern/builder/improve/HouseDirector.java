package com.at.designpattern.builder.improve;

import lombok.Setter;

/**
 * @author zero
 * @create 2020-11-18 10:35
 *
 * 指挥建造
 *
 */
public class HouseDirector {

    @Setter
    HouseBulider houseBulider = null;

    public HouseDirector(HouseBulider houseBulider) {
        this.houseBulider = houseBulider;
    }

    //指挥者指挥建造 House 流程
    public House building() {
        System.out.println("direct 开始指挥建造流程");
        houseBulider.buildBase();
        houseBulider.buildWalls();
        houseBulider.roofed();

        System.out.println("direct 指挥建造流程完成");

        System.out.println("指挥者指挥建造者交付建造好的 house");
        return houseBulider.buildHouse();
    }

}
