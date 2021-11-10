package com.at.designpattern.bridge;

/**
 * @author zero
 * @create 2020-11-18 19:34
 */
public class FoldedPhone extends Phone {
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        //super.open() --> Phone.open() --> brand.open（具体的Brand实现）
        //通过抽象类Phone 连接 FoldedPhone 与 具体的Brand
        super.open();
        System.out.println("正在使用 open --> FoldedPhone ...");
    }

    public void close() {
        super.close();
        System.out.println("正在使用 close --> FoldedPhone ...");
    }

    public void call() {
        super.call();
        System.out.println("正在使用 call --> FoldedPhone ...");
    }

}
