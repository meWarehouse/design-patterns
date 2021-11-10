package com.at.designpattern.visitor;

/**
 * @author zero
 * @create 2020-11-19 21:46
 */
public class Success extends Action {
    @Override
    public void getRResult(Person person) {
        if(person instanceof Man){
            System.out.println("Man 认为 -> Success ...");
        }else if(person instanceof Woman){
            System.out.println("Woman 认为 -> Success ...");
        }
    }
}
