package com.at.designpattern.comomd;

/**
 * @author zero
 * @create 2020-11-19 20:04
 */
public class LightOffCommand implements Commond {

    LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
