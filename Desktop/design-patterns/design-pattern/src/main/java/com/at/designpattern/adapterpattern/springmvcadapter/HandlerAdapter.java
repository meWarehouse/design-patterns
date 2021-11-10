package com.at.designpattern.adapterpattern.springmvcadapter;

/**
 * @author zero
 * @create 2020-11-18 16:29
 */
public interface HandlerAdapter {

    boolean supports(Object var1);

    void handle(Object var1);

}
