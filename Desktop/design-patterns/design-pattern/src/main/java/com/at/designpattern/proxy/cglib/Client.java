package com.at.designpattern.proxy.cglib;

/**
 * @author zero
 * @create 2020-11-19 16:02
 */
public class Client {
    public static void main(String[] args) {


        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(new TeacherDao()).getProxyInstance();

        //执行代理对象方法，触发intercept 方法，从而实现对目标对象的调用
        proxyInstance.teach();

    }
}
