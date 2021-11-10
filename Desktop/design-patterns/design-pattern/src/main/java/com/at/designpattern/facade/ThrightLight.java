package com.at.designpattern.facade;

/**
 * @author zero
 * @create 2020-11-19 10:43
 */
public class ThrightLight {

    private ThrightLight() {
    }

    public static ThrightLight instance = new ThrightLight();

    public void on() {
        System.out.println("ThrightLight ... on");
    }

    public void off() {
        System.out.println("ThrightLight ... off");
    }

    public void dim() {
        System.out.println("ThrightLight ... dim");
    }

    public void bright() {
        System.out.println("ThrightLight ... bright");
    }


}
