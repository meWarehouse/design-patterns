package com.at.designpattern.facade;

/**
 * @author zero
 * @create 2020-11-19 10:43
 */
public class DVAPlayer {

    private DVAPlayer() {
    }

    public static DVAPlayer instance = new DVAPlayer();

    public void on() {
        System.out.println("DVAPlayer ... on");
    }

    public void play() {
        System.out.println("DVAPlayer ... play");
    }

    public void off() {
        System.out.println("DVAPlayer ... off");
    }

    public void pause() {
        System.out.println("DVAPlayer ... pause");
    }
}
