package com.at.designpattern.temple;

/**
 * @author zero
 * @create 2020-11-19 18:42
 */
public class PureMilk extends SoyaMilk{
    @Override
    void addCondiments() {
        //不需要添加是就无需实现
    }

    @Override
    boolean addWantCondiments() {
        return false;
    }
}
