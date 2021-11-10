package com.at.designpattern.proxy.staticproxy;

/**
 * @author zero
 * @create 2020-11-19 14:53
 * <p>
 * 1) 优点：在不修改目标对象的功能前提下, 能通过代理对象对目标功能扩展
 * 2) 缺点：因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类
 * 3) 一旦接口增加方法,目标对象与代理对象都要维护
 */
public class Client {
    public static void main(String[] args) {

        //创建目标对象(被代理的对象)
        TeacherDao teacherDao = new TeacherDao();

        //创建代理对象，同时将代理对象传递给代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);

        teacherDaoProxy.teach();

    }
}
