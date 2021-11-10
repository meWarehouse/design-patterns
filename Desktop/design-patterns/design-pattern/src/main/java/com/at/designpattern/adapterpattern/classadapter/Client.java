package com.at.designpattern.adapterpattern.classadapter;

/**
 * @author zero
 * @create 2020-11-18 15:36
 */
public class Client {
    public static void main(String[] args) {

        System.out.println("-----类适配器-----");

        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());


    }
}
