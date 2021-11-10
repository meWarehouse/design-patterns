package com.at.designprinciples.singleresponsibility;

/**
 * @author zero
 * @create 2020-11-17 8:01
 * <p>
 * <p>
 * //1. 遵守单一职责原则
 * //2. 但是这样做的改动很大，即将类分解，同时修改客户端
 */
public class Singleresponsibility2 {
    public static void main(String[] args) {

        VehicleWay vehicleWay = new VehicleWay();
        vehicleWay.run("汽车");

        VehicleAir vehicleAir = new VehicleAir();
        vehicleAir.run("飞机");
    }
}

class VehicleWay {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上行使.........");
    }
}
class VehicleAir {
    public void run(String vehicle) {
        System.out.println(vehicle + "在空中上行使.........");
    }
}
class VehicleWater {
    public void run(String vehicle) {
        System.out.println(vehicle + "在水中上行使.........");
    }
}


