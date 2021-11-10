package com.at.designpattern.comomd;

/**
 * @author zero
 * @create 2020-11-19 20:01
 */
//命令接口
public interface Commond {
    //执行命令
    void execute();
    //撤销命令
    void undo();
}
