package com.at.designpattern.adapterpattern.objectadapter;

import com.at.designpattern.adapterpattern.classadapter.Phone;
import com.at.designpattern.adapterpattern.classadapter.Voltage200V;

/**
 * @author zero
 * @create 2020-11-18 15:36
 */
public class Client {
    public static void main(String[] args) {

        System.out.println("-----对象适配器-----");

        //VoltageAdapter持有Voltage200V 对象
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage200V()));


    }
}
