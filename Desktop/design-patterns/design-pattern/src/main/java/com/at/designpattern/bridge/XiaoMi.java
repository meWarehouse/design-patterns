package com.at.designpattern.bridge;

/**
 * @author zero
 * @create 2020-11-18 19:31
 */
public class XiaoMi implements Brand {
    @Override
    public void call() {
        System.out.println("XiaoMi --> call");
    }

    @Override
    public void open() {
        System.out.println("XiaoMi --> open");
    }

    @Override
    public void close() {
        System.out.println("XiaoMi --> close");
    }
}
