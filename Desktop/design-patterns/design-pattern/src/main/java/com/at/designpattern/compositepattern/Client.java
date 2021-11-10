package com.at.designpattern.compositepattern;

/**
 * @author zero
 * @create 2020-11-18 23:49
 */
public class Client {
    public static void main(String[] args) {

        //new 一个 unversity
        OrganizationComponent university = new University("清华大学", "中国最好的大学");

        //new 两个college
        OrganizationComponent completeCollege = new College("计算机学院", "计算机");
        OrganizationComponent infocollege = new College("信息工程学院", "信息工程");

        //为两个学院分别创建连个部门
        completeCollege.add(new Department("软件工程", "软件"));
        completeCollege.add(new Department("网络工程", "网络"));
        completeCollege.add(new Department("计算机科学与技术", "计算机科学与技术"));

        infocollege.add(new Department("通信工程", "通信"));
        infocollege.add(new Department("信息工程", "信息"));

        //将College 加入到university
        university.add(completeCollege);
        university.add(infocollege);


        university.print();


    }
}
