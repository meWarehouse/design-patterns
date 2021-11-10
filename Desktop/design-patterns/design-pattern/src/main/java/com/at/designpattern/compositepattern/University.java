package com.at.designpattern.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zero
 * @create 2020-11-18 23:38
 */

//University 就是Composite 可以管理College
public class University extends OrganizationComponent {

    List<OrganizationComponent> ocs = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        ocs.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        ocs.remove(organizationComponent);
    }

    @Override
    public String getName() {
        //根据需求改变
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    //输出 University 包含的所有学院
    @Override
    protected void print() {

        System.out.println("-------------------" + this.getName() + "--------------------");

        for (OrganizationComponent oc : ocs) {
            oc.print();
        }

    }
}
