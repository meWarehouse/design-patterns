package com.at.designpattern.adapterpattern.classadapter;

/**
 * @author zero
 * @create 2020-11-18 15:35
 */
public class Phone {

    public int charging(IVoltage5V iVoltage5V) {
        int v = iVoltage5V.output5V();
        System.out.println("使用" + v);
        return v;
    }

}
