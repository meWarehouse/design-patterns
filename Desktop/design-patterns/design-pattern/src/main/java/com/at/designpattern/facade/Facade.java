package com.at.designpattern.facade;

/**
 * @author zero
 * @create 2020-11-19 10:50
 */
public class Facade {

    DVAPlayer dvaPlayer;
    Popcon popcon;
    Screen screen;
    ThrightLight thrightLight;

    public Facade() {
        this.dvaPlayer = DVAPlayer.instance;
        this.popcon = Popcon.instance;
        this.screen = Screen.instance;
        this.thrightLight = ThrightLight.instance;
    }

    public void read() {
        dvaPlayer.on();
        popcon.on();
        screen.down();
        thrightLight.dim();
    }

    public void play() {
        dvaPlayer.play();
    }

    public void pause() {
        dvaPlayer.pause();
    }

    public void end() {
        dvaPlayer.off();
        screen.up();
        thrightLight.bright();
    }

}
