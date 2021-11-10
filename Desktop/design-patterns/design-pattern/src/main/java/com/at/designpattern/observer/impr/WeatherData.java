package com.at.designpattern.observer.impr;

import com.at.designpattern.observer.CurrentConditions;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zero
 * @create 2020-11-20 18:57
 * <p>
 * 1. 包含最新的天气情况信息
 * 2. 含有观察者集合，使用 ArrayList 管理
 * 3. 当数据有更新时，就主动的调用 ArrayList, 通知所有的（接入方）就看到最新的信息
 */
@Data
public class WeatherData implements Subject {

    private float temperatrue;
    private float pressure;
    private float humidity;

    //观察者集合
    private List<Observer> currentConditions;

    public WeatherData() {
        currentConditions = new ArrayList<>();
    }

    public void dataChange() {
        //通知所有的订阅者
        notifyObserver();
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperatrue = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    @Override
    public void registerObserver(Observer observer) {
        currentConditions.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        currentConditions.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < currentConditions.size(); i++) {
            currentConditions.get(i).update(this.temperatrue, this.pressure, this.humidity);
        }
    }
}
