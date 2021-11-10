package com.at.designpattern.prototype.deepclone;

/**
 * @author zero
 * @create 2020-11-18 8:45
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {

        DeepPrototype prototype = new DeepPrototype();
        prototype.name = "一一";
        prototype.deepCloneableTarget = new DeepCloneableTarget("oop","clone");

//        DeepPrototype clone1 = (DeepPrototype) prototype.clone();
//        DeepPrototype clone2 = (DeepPrototype) prototype.clone();
//        DeepPrototype clone3 = (DeepPrototype) prototype.clone();

        DeepPrototype clone1 = (DeepPrototype) prototype.deepClone();
        DeepPrototype clone2 = (DeepPrototype) prototype.deepClone();
        DeepPrototype clone3 = (DeepPrototype) prototype.deepClone();

        System.out.println(clone1.name  + "-->" + clone1.deepCloneableTarget.hashCode());
        System.out.println(clone2.name  + "-->" + clone2.deepCloneableTarget.hashCode());
        System.out.println(clone3.name  + "-->" + clone3.deepCloneableTarget.hashCode());

    }
}
