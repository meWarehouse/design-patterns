package com.at.designpattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author zero
 * @create 2020-11-19 23:24
 */
public class InfoCollegeIterator implements Iterator {

    // 数据（Deprtment）的存放方式
    List<Department> departments;
    int index = -1;

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    //判断是否有下一个
    @Override
    public boolean hasNext() {
        if (index >= departments.size() - 1) {
            return false;
        } else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departments.get(index);
    }

    @Override
    public void remove() {

    }
}
