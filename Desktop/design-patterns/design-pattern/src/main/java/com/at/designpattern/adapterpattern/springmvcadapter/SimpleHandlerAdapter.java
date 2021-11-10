package com.at.designpattern.adapterpattern.springmvcadapter;

/**
 * @author zero
 * @create 2020-11-18 16:30
 */
public class SimpleHandlerAdapter implements HandlerAdapter {
    @Override
    public boolean supports(Object var1) {
        return var1 instanceof SimpleController ;
    }

    @Override
    public void handle(Object var1) {
        ((SimpleController)var1).doSimplerHandler();
    }
}
