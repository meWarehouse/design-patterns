package com.at.designpattern.flyweight;

/**
 * @author zero
 * @create 2020-11-19 11:41
 */
public class Client {
    public static void main(String[] args) {

        WebSiteFactory factory = new WebSiteFactory();

        WebSite weibo = factory.getWebSiteCategory("weibo");
        weibo.use(new User("A"));

        factory.getWebSiteCategory("boke").use(new User("A"));
        factory.getWebSiteCategory("boke").use(new User("B"));
        factory.getWebSiteCategory("boke").use(new User("G"));

        System.out.println("网站分类总数："+factory.getCount());

    }
}
