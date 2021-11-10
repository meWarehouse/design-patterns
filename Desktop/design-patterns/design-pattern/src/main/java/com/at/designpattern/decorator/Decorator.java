package com.at.designpattern.decorator;


/**
 * @author zero
 * @create 2020-11-18 21:18
 */
public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double cost() {
        // super.getPrice()调料的价格 drink.cost()咖啡的价格
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        return super.getDes() + " " + super.getPrice() + " && " + drink.getDes();
    }
}
