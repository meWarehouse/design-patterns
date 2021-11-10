package com.at.designpattern.adapterpattern.classadapter;

/**
 * @author zero
 * @create 2020-11-18 15:33
 * <p>
 * 适配器
 */
public class VoltageAdapter extends Voltage200V implements IVoltage5V {

    //将继承关系改为聚合 public class VoltageAdapter extends Voltage200V

    @Override
    public int output5V() {
        //将220v 转为 5v
        int det = this.output220v() / 44;
        System.out.println("适配器转换：det=" + det);
        return det;
    }
}
