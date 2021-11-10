package com.at.designpattern.compositepattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zero
 * @create 2020-11-18 23:31
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class OrganizationComponent {

    private String name; //组织名
    private String des; //组织描述

    //使用默认实现 因为并不是所有的组织都需要管理其他组织:如最底层的组织
    protected void add(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    //打印方法所有的组织类都需要实现
    protected abstract void print();

}
