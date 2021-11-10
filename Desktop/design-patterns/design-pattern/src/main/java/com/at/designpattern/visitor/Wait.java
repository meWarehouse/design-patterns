package com.at.designpattern.visitor;

/**
 * @author zero
 * @create 2020-11-19 22:07
 */
public class Wait extends Action{
    @Override
    public void getRResult(Person person) {
        if(person instanceof Man){
            System.out.println("Man .... Wait ......");
        }else if(person instanceof Woman){
            System.out.println("Woman .... Wait ......");
        }
    }
}
