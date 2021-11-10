package com.at.designpattern.iterator;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author zero
 * @create 2020-11-19 23:24
 */
public class ComputerCollegeIterator implements Iterator {

    //Deprtment 的存放方式
    Department[] departments;
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    //判断是否有下一个
    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position++;
        return department;
    }

    @Override
    public void remove() {

    }
}
