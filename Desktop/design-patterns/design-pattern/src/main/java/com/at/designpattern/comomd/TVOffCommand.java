package com.at.designpattern.comomd;

/**
 * @author zero
 * @create 2020-11-19 20:04
 */
public class TVOffCommand implements Commond {

    TVReceiver tvReceiver;

    public TVOffCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.off();
    }

    @Override
    public void undo() {
        tvReceiver.on();
    }
}
