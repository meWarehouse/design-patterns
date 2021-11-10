package com.at.designpattern.observer.impr;

/**
 * @author zero
 * @create 2020-11-20 19:19
 */
//观察者接口，由观察者实现
public interface Observer {

    //温度 气压 湿度
    void update(float temperatrue, float pressure, float humidity);

}
