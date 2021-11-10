package com.at.designpattern.builder;

/**
 * @author zero
 * @create 2020-11-18 10:04
 */
public abstract class AbsHoust {

    public abstract void buildBse();

    public abstract void buildwalls();

    public abstract void roofed();

    public void building() {
        buildBse();
        buildwalls();
        roofed();
    }

}
