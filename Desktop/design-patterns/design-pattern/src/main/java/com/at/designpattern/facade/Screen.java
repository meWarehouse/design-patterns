package com.at.designpattern.facade;

/**
 * @author zero
 * @create 2020-11-19 10:43
 */
public class Screen {

    private Screen() {
    }

    public static Screen instance = new Screen();

    public void up() {
        System.out.println("Screen ... up");
    }

    public void down() {
        System.out.println("Screen ... down");
    }


}
