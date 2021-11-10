package com.at.designpattern.proxy.jdkproxy;

import com.at.designpattern.proxy.staticproxy.ITeacherDao;

import java.lang.annotation.Target;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zero
 * @create 2020-11-19 15:13
 */
public class ProxyFactory {

    //被代理的目标对象
    ITeacherDao iTeacherDao;

    public ProxyFactory(ITeacherDao iTeacherDao) {
        this.iTeacherDao = iTeacherDao;
    }

    public ITeacherDao getProxyInstance() {

        /**
         * public static Object newProxyInstance(ClassLoader loader,
         *                                           Class<?>[] interfaces,
         *                                           InvocationHandler h)
         *   ClassLoader loader 指定当前目标对象使用的类加载器
         *   Class<?>[] interfaces 目标对象实现的接口类型
         *   InvocationHandler  事件处理，执行目标对象的方法时，会触发执行的方法，将当前执行的目标对象方法作为参数传入
         */

        return (ITeacherDao) Proxy.newProxyInstance(
                iTeacherDao.getClass().getClassLoader(),
                iTeacherDao.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        System.out.println("JDK 开始代理 ......");

                        Object invoke = method.invoke(iTeacherDao, args);

                        System.out.println("JDk 代理结束 ......");

                        return invoke;
                    }
                });
    }


}
