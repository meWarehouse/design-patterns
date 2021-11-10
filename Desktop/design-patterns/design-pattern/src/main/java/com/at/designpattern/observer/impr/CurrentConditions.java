package com.at.designpattern.observer.impr;

/**
 * @author zero
 * @create 2020-11-20 18:56
 */
//具体观察者
public class CurrentConditions implements Observer {

    private float temperature;
    private float pressure;
    private float humidity;

    //更新天气情况，由WeatherData 调用，用来推送最新变化
    @Override
    public void update(float temperatrue, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    //显示
    public void display() {
        System.out.println("***Today mTemperature: " + temperature + "***");
        System.out.println("***Today mPressure: " + pressure + "***");
        System.out.println("***Today mHumidity: " + humidity + "***");
    }

}