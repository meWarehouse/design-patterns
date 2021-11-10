package com.at.designpattern.visitor;

/**
 * @author zero
 * @create 2020-11-19 21:56
 */
public class Client {
    public static void main(String[] args) {

        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Woman());
        objectStructure.attach(new Man());

        //成功
        objectStructure.display(new Success());

        objectStructure.display(new Fail());

        objectStructure.display(new Wait());


    }
}
