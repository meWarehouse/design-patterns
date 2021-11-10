package com.at.designpattern.facade;

/**
 * @author zero
 * @create 2020-11-19 10:48
 */
public class Client {
    public static void main(String[] args) {


        //打开DVAPlayer Popcon 调暗灯光 放下屏幕Screen ...

        //暂停播放

        //关闭DVAPlayer Popcon 调亮灯光 收起屏幕Screen ...

        Facade facade = new Facade();

        facade.read();
        facade.play();
        facade.pause();
        facade.end();

    }
}
