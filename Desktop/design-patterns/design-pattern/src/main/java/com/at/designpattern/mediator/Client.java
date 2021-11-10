package com.at.designpattern.mediator;

/**
 * @author zero
 * @create 2020-11-20 20:48
 */
public class Client {
    public static void main(String[] args) {

        Mediator mediator = new ConcreteMediator();
        Alarm alarm = new Alarm(mediator, "alarm");
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator,
                "coffeeMachine");
        Curtains curtains = new Curtains(mediator, "curtains");
        TV tV = new TV(mediator, "TV");
        alarm.sendAlarm(0);
        coffeeMachine.finishCoffeeMachine();
        alarm.sendAlarm(1);
    }
}
