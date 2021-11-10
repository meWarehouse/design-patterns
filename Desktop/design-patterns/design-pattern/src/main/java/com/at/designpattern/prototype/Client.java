package com.at.designpattern.prototype;

/**
 * @author zero
 * @create 2020-11-17 23:15
 */
public class Client {
    public static void main(String[] args) {

        Sheep sheep = new Sheep("tom", 1, "白色");

        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());

        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);

    }
}
