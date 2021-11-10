package com.at.designpattern.adapterpattern.objectadapter;

import com.at.designpattern.adapterpattern.classadapter.IVoltage5V;
import com.at.designpattern.adapterpattern.classadapter.Voltage200V;

/**
 * @author zero
 * @create 2020-11-18 15:33
 * <p>
 * 适配器
 */
public class VoltageAdapter implements IVoltage5V {

    //将继承关系改为聚合 public class VoltageAdapter extends Voltage200V
    private Voltage200V voltage200V;

    public VoltageAdapter(Voltage200V voltage200V) {
        this.voltage200V = voltage200V;
    }

    @Override
    public int output5V() {
        //将220v 转为 5v
        int det = 0;

        if (voltage200V != null) {
            int src = voltage200V.output220v();
            det = src / 44;
            System.out.println("适配器转换完成：det=" + det);
        }

        return det;
    }
}
