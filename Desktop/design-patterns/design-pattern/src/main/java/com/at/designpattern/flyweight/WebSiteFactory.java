package com.at.designpattern.flyweight;

import java.util.HashMap;

/**
 * @author zero
 * @create 2020-11-19 11:35
 */
//享元工厂 就是一个享元池
public class WebSiteFactory {

    private HashMap<String, WebSite> pool = new HashMap<>();

    //如果pool中有就直接返回 没有就 先创建，创建后保存到pool中 然后返回
    public WebSite getWebSiteCategory(String type) {
        if (!pool.containsKey(type)) {
            //创建并保存
            pool.put(type, new ConcreateWebSite(type));
        }
        return pool.get(type);
    }

    public Integer getCount() {
        return pool.size();
    }

}
