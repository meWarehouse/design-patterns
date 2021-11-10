package com.at.designpattern.iterator;

import java.util.Iterator;

/**
 * @author zero
 * @create 2020-11-19 23:36
 */
public interface College {

    //获取聚合类自身的name
    public String getName();

    //将数据添加到聚合类
    void addDepartment(String name, String desc);

    //根据聚合类存储的数据形式返回一个迭代器
    Iterator createIterator();

}
