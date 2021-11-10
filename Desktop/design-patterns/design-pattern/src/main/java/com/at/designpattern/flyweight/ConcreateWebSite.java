package com.at.designpattern.flyweight;

/**
 * @author zero
 * @create 2020-11-19 11:32
 */

// ConcreateWebSite 是具体的享元角色
public class ConcreateWebSite extends WebSite {

    private String type;

    public ConcreateWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站发布的形式为:" + type + "\t 正在使用中... 使用者：" + user);
    }
}
