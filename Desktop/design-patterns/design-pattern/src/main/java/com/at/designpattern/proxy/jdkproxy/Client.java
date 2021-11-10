package com.at.designpattern.proxy.jdkproxy;

import com.at.designpattern.proxy.staticproxy.ITeacherDao;
import com.at.designpattern.proxy.staticproxy.TeacherDao;
import com.sun.org.glassfish.gmbal.AMXMBeanInterface;

/**
 * @author zero
 * @create 2020-11-19 15:27
 */
public class Client {
    public static void main(String[] args) {

        ITeacherDao proxyInstance = new ProxyFactory(new TeacherDao()).getProxyInstance();
        System.out.println("proxyInstance:"+proxyInstance.getClass());
        proxyInstance.teach();

    }
}
