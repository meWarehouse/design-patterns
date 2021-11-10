package com.at.designpattern.comomd;

/**
 * @author zero
 * @create 2020-11-19 20:04
 */
public class LightOnCommand implements Commond {

    private LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
