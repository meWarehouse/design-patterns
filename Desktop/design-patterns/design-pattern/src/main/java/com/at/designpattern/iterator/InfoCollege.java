package com.at.designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zero
 * @create 2020-11-19 23:37
 */
public class InfoCollege implements College {

    //定义数据存储形式
    List<Department> departments;

    //使用构造器初始化数据
    public InfoCollege() {
        departments = new ArrayList<>();
        addDepartment("A 信息专业", "A");
        addDepartment("B 信息专业", "B");
        addDepartment("C 信息专业", "C");
        addDepartment("D 信息专业", "D");
    }

    @Override
    public String getName() {
        return "InfoCollege";
    }

    //将数据以指定的信息存入聚合类中
    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments.add(department);
    }

    //通过存储形式返回一个迭代器
    @Override
    public Iterator createIterator() {
        //聚合一个迭代器 通过数据生成一个迭代器 使得数据在聚合类与迭代器之间共享
        return new InfoCollegeIterator(departments);
    }
}
