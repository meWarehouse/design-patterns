package com.at.designpattern.visitor;

/**
 * @author zero
 * @create 2020-11-19 21:44
 */
//被访问者
public abstract class Person {
    //开启一个访问接口 供其他访问者访问
    abstract void accept(Action action);

    abstract void behavior();

}
