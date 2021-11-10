package com.at.designpattern.prototype.impr;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author zero
 * @create 2020-11-17 23:13
 * Java 中 Object 类是所有类的根类，Object 类提供了一个 clone()方法，
 * 该方法可以将一个 Java 对象复制一份，但是需要实现 clone 的 Java 类必须要实现一个接口 Cloneable，
 * 该接口表示该类能够复制且具有复制的能力 => 原型模式
 */
@Data
@ToString
public class Sheep implements Cloneable {

    private String name;
    private Integer age;
    private String color;
    private String addr = "新疆";

    private Sheep friend;

    public Sheep(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Sheep() {
    }

    @Override
    protected Object clone() {
        Sheep sheep = null;

        try {
            sheep = (Sheep) super.clone();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return sheep;
    }
}
