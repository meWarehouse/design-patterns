package com.at.designpattern.compositepattern;

/**
 * @author zero
 * @create 2020-11-18 23:46
 */

// Department 最底层的组织没有管理者所以也就无需实现 add remove 方法
public class Department extends OrganizationComponent {

    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
