package com.at.designprinciples.dependenceinversion;

/**
 * @author zero
 * @create 2020-11-17 9:09
 * <p>
 * 1)高层模块不应该依赖低层模块，二者都应该依赖其抽象
 * 2) 抽象不应该依赖细节，细节应该依赖抽象
 * 3) 依赖倒转(倒置)的中心思想是面向接口编程
 * 4) 依赖倒转原则是基于这样的设计理念：相对于细节的多变性，抽象的东西要稳定的 多。
 * 以抽象为基础搭建的架构比以细节为基础的架构要稳定的多。在java中，抽象 指的是接口或抽象类，细节就是具体的实现类
 * 5) 使用接口或抽象类的目的是制定好规范，而不涉及任何具体的操作，把展现细节的 任务交给他们的实现类去完成
 * <p>
 * 接口传递
 * 构造器传递
 * setter传递
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Persion persion = new Persion();
        persion.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "Email 信息....";
    }
}

class WeiX {
    public String getInfo() {
        return "WeiX 信息....";
    }
}

class Persion {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}