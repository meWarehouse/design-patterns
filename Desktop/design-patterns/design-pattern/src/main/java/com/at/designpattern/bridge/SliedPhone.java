package com.at.designpattern.bridge;

/**
 * @author zero
 * @create 2020-11-18 19:40
 */
public class SliedPhone extends Phone {
    public SliedPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("正在使用 open --> SliedPhone ...");
    }

    public void close() {
        super.close();
        System.out.println("正在使用 close --> SliedPhone ...");
    }

    public void call() {
        super.call();
        System.out.println("正在使用 call --> SliedPhone ...");
    }

}
