package com.at.designpattern.adapterpattern.interfaceadapter;

/**
 * @author zero
 * @create 2020-11-18 16:04
 */
public class Client {
    public static void main(String[] args) {

        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void m1() {
                System.out.println("使用m1");
            }
        };
        absAdapter.m1();

    }
}
