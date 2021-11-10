package com.at.designprinciples.singleresponsibility;

/**
 * @author zero
 * @create 2020-11-17 8:01
 * <p>
 * 这种修改方法没有对原来的类做大的修改，只是增加方法
 * 这里虽然没有在类这个级别上遵守单一职责原则，但是在方法级别上，仍然是遵守单一职责
 */
public class Singleresponsibility3 {
    public static void main(String[] args) {
        Vehicle3 vehicle3 = new Vehicle3();

        vehicle3.runWay("汽车");
        vehicle3.runAir("飞机");

        //TODO ...
    }
}

class Vehicle3 {
    public void runWay(String vehicle) {
        System.out.println(vehicle + "在公路上行使.........");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "在空中上行使.........");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水中上行使.........");
    }
}


