package com.at.designpattern.adapterpattern.springmvcadapter;

/**
 * @author zero
 * @create 2020-11-18 16:37
 */
public class HttpHandlerAdapter implements HandlerAdapter {
    @Override
    public boolean supports(Object var1) {
        return var1 instanceof HttpController;
    }

    @Override
    public void handle(Object var1) {
        ((HttpController)var1).doGet();
    }
}
