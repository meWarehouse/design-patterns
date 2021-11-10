package com.at.designpattern.iterator;

import java.util.Collections;
import java.util.Iterator;

/**
 * @author zero
 * @create 2020-11-19 23:37
 */
public class ComputerCollege implements College {

    Department[] departments;
    int num = 0; //保存当前数组的对象的个数

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("java专业", "java");
        addDepartment("php专业", "php");
        addDepartment("c专业", "c");
        addDepartment("python专业", "python");
    }

    @Override
    public String getName() {
        return "ComputerCollege";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[num] = department;
        num++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
