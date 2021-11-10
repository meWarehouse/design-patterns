package com.at.designprinciples.interfacesegregation;

/**
 * @author zero
 * @create 2020-11-17 8:17
 * <p>
 * 一个类对另一个类的依赖应该建立在最小的接口上
 */
public class Segregation1 {
    public static void main(String[] args) {

        A a = new A();
        a.depend1(new C());
        a.depend2(new C());
        a.depend3(new C());

        System.out.println("------------------------------------");

        B b = new B();
        b.depend1(new D());
        b.depend4(new D());
        b.depend5(new D());


    }
}


/**
 * 类 A 通过接口 Interface1 依赖类 B，
 * 类 C 通过接口 Interface1 依赖类 D，
 * 如果接口 Interface1 对于类 A 和类 C 来说不是最小接口，
 * 那么类 B 和类 D 必须去实现他们不需要的方法
 */
interface Inter1 {
    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();
}

class C implements Inter1 {
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

    @Override
    public void operation4() {
        System.out.println("C 操作 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("C 操作 operation5");
    }
}

class D implements Inter1 {

    @Override
    public void operation1() {
        System.out.println("D 操作 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D 操作 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D 操作 operation3");
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
class A {
    public void depend1(Inter1 inter1) {
        inter1.operation1();
    }

    public void depend2(Inter1 inter1) {
        inter1.operation2();
    }

    public void depend3(Inter1 inter1) {
        inter1.operation3();
    }
}

//B 类通过接口 Interface1 依赖(使用) B 类，但是只会用到 1,4,5方法
class B {
    public void depend1(Inter1 inter1) {
        inter1.operation1();
    }

    public void depend4(Inter1 inter1) {
        inter1.operation4();
    }

    public void depend5(Inter1 inter1) {
        inter1.operation5();
    }
}

