package com.at.designpattern.mediator;

/**
 * @author zero
 * @create 2020-11-20 20:27
 */
//中介者需要沟通的类
public abstract class Colleague {

    //聚合中介者
    private Mediator mediator;
    public String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return this.mediator;
    }

    public abstract void sendMessage(int stateChange);

}
