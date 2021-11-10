package com.at.designpattern.comomd;

import com.sun.istack.internal.Nullable;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author zero
 * @create 2020-11-19 20:25
 */
public class Client {
    public static void main(String[] args) {

        //使用命令设计模式，对电灯进行操作

        //创建接受者(电灯)
        LightReceiver lightReceiver = new LightReceiver();

        //创建电灯的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        //创建一个遥控器
        RemoteController remoteController = new RemoteController();

        //给遥控器设置命令
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        //测试
        System.out.println("---------------使用遥控器操作电灯------------");
        remoteController.onButtonWasPushed(0);
        remoteController.offButtonWasPushed(0);
        remoteController.undoButtonCommit();

        System.out.println("---------------使用遥控器操作电视------------");

        TVReceiver tvReceiver = new TVReceiver();
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        remoteController.setCommand(1, tvOnCommand, tvOffCommand);
        remoteController.offButtonWasPushed(1);
        remoteController.onButtonWasPushed(1);
        remoteController.undoButtonCommit();


    }
}

