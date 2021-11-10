package com.at.designpattern.mediator;

/**
 * @author zero
 * @create 2020-11-20 20:31
 */
public class Alarm extends Colleague {

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        //将自身注册到中介者中
        mediator.register(name,this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }

    public void sendAlarm(int stateChange){
        sendMessage(stateChange);
    }

}
