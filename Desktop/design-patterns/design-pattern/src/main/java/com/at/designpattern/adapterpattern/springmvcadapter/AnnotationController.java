package com.at.designpattern.adapterpattern.springmvcadapter;

/**
 * @author zero
 * @create 2020-11-18 16:26
 */
public class AnnotationController implements Controller {
    public AnnotationController() {
    }

    public void doAnnotationHandler(){
        System.out.println("AnnotationController ...");
    }

}
