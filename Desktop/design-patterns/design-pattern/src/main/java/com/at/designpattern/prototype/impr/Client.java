package com.at.designpattern.prototype.impr;


/**
 * @author zero
 * @create 2020-11-17 23:21
 */
public class Client {
    public static void main(String[] args) {

        Sheep sheep = new Sheep("tom", 1, "bai");

        /**
         * 浅拷贝的介绍
         * 1) 对于数据类型是基本数据类型的成员变量，浅拷贝会直接进行值传递，也就是将 该属性值复制一份给新的对象。
         * 2) 对于数据类型是引用数据类型的成员变量，比如说成员变量是某个数组、某个类 的对象等，那么浅拷贝会进行引用传递，
         * 也就是只是将该成员变量的引用值（内 存地址）复制一份给新的对象。因为实际上两个对象的该成员变量都指向同一个 实例。
         * 在这种情况下，在一个对象中修改该成员变量会影响到另一个对象的该成 员变量值
         * 3) 前面我们克隆羊就是浅拷贝
         * 4) 浅拷贝是使用默认的 clone()方法来实现 sheep = (Sheep) super.clone();
         */
        sheep.setFriend(new Sheep("jim", 2, "黑色"));

        Sheep clone1 = (Sheep) sheep.clone();
        Sheep clone2 = (Sheep) sheep.clone();
        Sheep clone3 = (Sheep) sheep.clone();

        System.out.println(clone1 + "-->" + clone1.getFriend().hashCode());
        System.out.println(clone2 + "-->" + clone2.getFriend().hashCode());
        System.out.println(clone3 + "-->" + clone3.getFriend().hashCode());

    }
}
