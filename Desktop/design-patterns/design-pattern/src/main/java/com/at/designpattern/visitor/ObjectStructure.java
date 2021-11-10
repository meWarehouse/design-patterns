package com.at.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zero
 * @create 2020-11-19 22:02
 */
public class ObjectStructure {

    //维护一个集合
    private List<Person> persons = new ArrayList<>();

    //添加
    public void attach(Person person) {
        persons.add(person);
    }

    //移除
    public void detach(Person person) {
        persons.remove(person);
    }

    //显示结果
    public void display(Action action) {
        for (Person person : persons) {
            action.getRResult(person);
        }
    }


}
