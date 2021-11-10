package com.at.designpattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author zero
 * @create 2020-11-19 23:48
 */
public class OutPutImpl {

    //聚合类集合
    List<College> colleges;

    public OutPutImpl(List<College> colleges) {
        this.colleges = colleges;
    }

    //遍历聚合并打印信息
    public void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department next = (Department) iterator.next();
            System.out.println(next.getName());
        }
    }

    //遍历所有学院,然后调用 printDepartment 输出各个学院的系
    public void printCollege() {
        //从colleges获取所有的学院
        Iterator<College> iterator = colleges.iterator();
        while (iterator.hasNext()) {
            //取出一个学院
            College college = iterator.next();
            System.out.println("-----------" + college.getName() + "---------");
            printDepartment(college.createIterator());
        }

    }


}
