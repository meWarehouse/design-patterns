package com.at.designprinciples.singleresponsibility;

/**
 * @author zero
 * @create 2020-11-17 8:01
 * <p>
 * 对类来说的，即一个类应该只负责一项职责。
 * 如类 A 负责两个不同职责：职责 1，职责 2。
 * 当职责 1 需求变更而改变 A 时，可能造成职责 2 执行错误，所以需要将类 A 的粒度分解为 A1，A2
 */
public class Singleresponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上行使.........");
    }
}


