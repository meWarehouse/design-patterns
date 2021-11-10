package com.at.designprinciples.interfacesegregation;

/**
 * @author zero
 * @create 2020-11-17 8:17
 * <p>
 * 一个类对另一个类的依赖应该建立在最小的接口上
 */
public class Segregation2 {
    public static void main(String[] args) {

        A2 a = new A2();
        a.depend1(new C2());
        a.depend2(new C2());
        a.depend3(new C2());

        System.out.println("------------------------------------");

        B2 b = new B2();
        b.depend1(new D2());
        b.depend4(new D2());
        b.depend5(new D2());

    }
}


interface Inter2 {
    void operation1();
}

interface Inter3 {
    void operation2();

    void operation3();
}

interface Inter4 {
    void operation4();

    void operation5();
}

class C2 implements Inter2, Inter3 {
    @Override
    public void operation1() {
        System.out.println("C 操作 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("C 操作 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("C 操作 operation3");
    }
}

class D2 implements Inter2, Inter4 {

    @Override
    public void operation1() {
        System.out.println("D 操作 operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D 操作 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D 操作 operation5");
    }
}


//A 类通过接口 Interface1 依赖(使用) B 类，但是只会用到 1,2,3 方法
class A2 {
    public void depend1(Inter2 inter2) {
        inter2.operation1();
    }

    public void depend2(Inter3 inter3) {
        inter3.operation2();
    }

    public void depend3(Inter3 inter3) {
        inter3.operation3();
    }
}

//B 类通过接口 Interface1 依赖(使用) B 类，但是只会用到 1,4,5方法
class B2 {
    public void depend1(Inter2 inter2) {
        inter2.operation1();
    }

    public void depend4(Inter4 inter4) {
        inter4.operation4();
    }

    public void depend5(Inter4 inter4) {
        inter4.operation5();
    }
}

