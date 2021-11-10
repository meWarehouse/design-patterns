package com.at.designpattern.observer;

/**
 * @author zero
 * @create 2020-11-20 19:00
 */
public class Client {
    public static void main(String[] args) {

        CurrentConditions currentConditions = new CurrentConditions();
        WeatherData weatherData = new WeatherData(currentConditions);
        weatherData.setData(30, 150, 40);

    }
}
