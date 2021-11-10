package com.at.designpattern.facade;

/**
 * @author zero
 * @create 2020-11-19 10:43
 */
public class Popcon {

    private Popcon() {
    }

    public static Popcon instance = new Popcon();

    public void on() {
        System.out.println("Popcon ... on");
    }

    public void off() {
        System.out.println("Popcon ... off");
    }

    public void pop() {
        System.out.println("Popcon ... pop");
    }


}
