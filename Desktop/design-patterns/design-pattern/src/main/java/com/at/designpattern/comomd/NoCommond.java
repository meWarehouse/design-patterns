package com.at.designpattern.comomd;

/**
 * @author zero
 * @create 2020-11-19 20:10
 *
 * 没有任何的命令：用于初始化每个按钮，当调用空命令时，对象什么都不需要做
 *
 */
public class NoCommond implements Commond {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
