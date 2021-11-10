package com.at.designpattern.builder;

/**
 * @author zero
 * @create 2020-11-18 10:07
 */
public class CommonHouse extends AbsHoust {
    @Override
    public void buildBse() {
        System.out.println("普通House --》 buildBse");
    }

    @Override
    public void buildwalls() {
        System.out.println("普通House --》 buildwalls");
    }

    @Override
    public void roofed() {
        System.out.println("普通House --》 roofed");
    }
}
