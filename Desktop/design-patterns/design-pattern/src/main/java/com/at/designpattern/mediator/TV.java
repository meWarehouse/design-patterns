package com.at.designpattern.mediator;

/**
 * @author zero
 * @create 2020-11-20 20:31
 */
public class TV extends Colleague {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        //将自身注册到中介者中
        mediator.register(name,this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }

    public void startTV(){
        System.out.println("start TV ...");
    }

    public void stopTV(){
        System.out.println("stop TV ...");
    }

}
