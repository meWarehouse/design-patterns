package com.at.designpattern.adapterpattern.springmvcadapter;

/**
 * @author zero
 * @create 2020-11-18 16:27
 */
public class SimpleController implements Controller {

    public SimpleController() {
    }

    public void doSimplerHandler(){
        System.out.println("SimpleController ...");
    }

}
