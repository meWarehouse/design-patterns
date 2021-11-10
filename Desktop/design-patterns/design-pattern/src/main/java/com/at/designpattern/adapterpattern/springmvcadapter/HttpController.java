package com.at.designpattern.adapterpattern.springmvcadapter;

/**
 * @author zero
 * @create 2020-11-18 16:24
 */
public class HttpController implements Controller{

    public HttpController() {
    }

    public void doGet(){
        System.out.println("HttpController ...");
    }

}
