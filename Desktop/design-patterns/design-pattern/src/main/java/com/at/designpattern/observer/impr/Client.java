package com.at.designpattern.observer.impr;

/**
 * @author zero
 * @create 2020-11-20 19:37
 */
public class Client {
    public static void main(String[] args) {

        //创建一个WeatherData
        WeatherData weatherData = new WeatherData();

        //创建一个观察者
        CurrentConditions currentConditions = new CurrentConditions();

        //将观察者注册到weatherData
        weatherData.registerObserver(currentConditions);

        //测试
        weatherData.setData(10.0F, 12.00F, 24.00F);


    }
}
