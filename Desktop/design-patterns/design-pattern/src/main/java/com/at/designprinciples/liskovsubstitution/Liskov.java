package com.at.designprinciples.liskovsubstitution;

/**
 * @author zero
 * @create 2020-11-17 9:42
 * 1) 如果对每个类型为T1的对象o1，都有类型为T2的对象o2，使得以T1定义的所有程序 P在所有的对象o1都代换成o2时，
 * 程序P的行为没有发生变化，那么类型T2是类型T1 的子类型。换句话说，所有引用基类的地方必须能透明地使用其子类的对象。
 * 2) 在使用继承时，遵循里氏替换原则，在子类中尽量不要重写父类的方法
 * 3) 里氏替换原则告诉我们，继承实际上让两个类耦合性增强了，在适当的情况下，可 以通过聚合，组合，依赖 来解决问
 */
public class Liskov {
    public static void main(String[] args) {

        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));

        System.out.println("-----------------------");

        B b = new B();
        System.out.println("11+3=" + b.func1(11, 3));
        System.out.println("1+8=" + b.func1(1, 8));
        System.out.println("11+3+9=" + b.func2(11, 3));

        System.out.println(b.func3(1, 2));

    }
}

class Base {
    //把更加基础的方法和成员写到 Base 类
}

class A extends Base {
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

class B extends Base {

    //如果 B 需要使用 A 类的方法,使用组合关系
    private A a = new A();

    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

    public int func3(int a, int b) {
        return this.a.func1(a, b);
    }
}