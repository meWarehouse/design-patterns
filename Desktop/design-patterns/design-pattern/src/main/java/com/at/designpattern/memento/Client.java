package com.at.designpattern.memento;


/**
 * @author zero
 * @create 2020-11-20 21:39
 */
public class Client {
    public static void main(String[] args) {

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("100 .......");
        caretaker.add(originator.saveMemento());

        originator.setState("80 ........");
        caretaker.add(originator.saveMemento());

        originator.setState("70 ........");
        caretaker.add(originator.saveMemento());

        System.out.println("当前状态："+originator.getState());

        System.out.println("=======================================");
        originator.getStateFromMemento(caretaker.getHistoryMemento(0));
        System.out.println("当前状态："+originator.getState());

    }
}
