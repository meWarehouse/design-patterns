package com.at.designpattern.adapterpattern.springmvcadapter;

/**
 * @author zero
 * @create 2020-11-18 16:35
 */
public class AnnotationHandlerAdapter implements HandlerAdapter {
    @Override
    public boolean supports(Object var1) {
        return var1 instanceof  AnnotationController;
    }

    @Override
    public void handle(Object var1) {
        ((AnnotationController)var1).doAnnotationHandler();
    }
}
