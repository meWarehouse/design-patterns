package com.at.designpattern.flyweight;

/**
 * @author zero
 * @create 2020-11-19 11:31
 */
public abstract class WebSite {
    //WebSite的use方法是一个内部的状态不会改变 而User是外部状态随着不同的用户的改变而改变
    public abstract void use(User user);

}
