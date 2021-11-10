package com.at.designpattern.bridge;

/**
 * @author zero
 * @create 2020-11-18 19:41
 */
public class Apple implements Brand {
    @Override
    public void call() {
        System.out.println("Apple --> call");
    }

    @Override
    public void open() {
        System.out.println("Apple --> open");
    }

    @Override
    public void close() {
        System.out.println("Apple --> close");
    }
}
