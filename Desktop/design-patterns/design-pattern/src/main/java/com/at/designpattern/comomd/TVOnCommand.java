package com.at.designpattern.comomd;

/**
 * @author zero
 * @create 2020-11-19 20:04
 */
public class TVOnCommand implements Commond {

    private TVReceiver tvReceiver;

    public TVOnCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.on();
    }

    @Override
    public void undo() {
        tvReceiver.off();
    }
}
