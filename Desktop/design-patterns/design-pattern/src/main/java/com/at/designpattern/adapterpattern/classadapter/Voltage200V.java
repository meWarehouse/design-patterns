package com.at.designpattern.adapterpattern.classadapter;

/**
 * @author zero
 * @create 2020-11-18 15:31
 * <p>
 * 被适配器
 */
public class Voltage200V {

    public int output220v() {

        int src = 220;
        System.out.println("输出220v");

        return src;
    }
}
