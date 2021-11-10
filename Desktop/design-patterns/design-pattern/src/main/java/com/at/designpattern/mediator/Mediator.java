package com.at.designpattern.mediator;

import java.util.Base64;

/**
 * @author zero
 * @create 2020-11-20 20:28
 */
//中介者
public interface Mediator {

    public abstract void register(String colleagueName,Colleague colleague);

    public abstract void getMessage(int stateChange,String colleagueName);

    public abstract void sendMessage();


}
