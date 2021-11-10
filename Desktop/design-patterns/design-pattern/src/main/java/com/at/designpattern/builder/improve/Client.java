package com.at.designpattern.builder.improve;

/**
 * @author zero
 * @create 2020-11-18 10:40
 */
public class Client {
    public static void main(String[] args) {

        HouseBulider houseBulider = new HightHouse();
        HouseDirector houseDirector = new HouseDirector(houseBulider);
        houseDirector.building();

        System.out.println("----------------------------------");

        houseDirector.setHouseBulider(new HightHouse());
        houseDirector.building();


        StringBuilder stringBuilder = new StringBuilder("sdf");
        System.out.println(stringBuilder);


    }
}
