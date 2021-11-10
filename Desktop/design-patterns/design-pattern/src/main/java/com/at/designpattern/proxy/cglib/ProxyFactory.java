package com.at.designpattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zero
 * @create 2020-11-19 15:49
 */
public class ProxyFactory implements MethodInterceptor {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }


    //返回一个代理对象：是target对象的代理对象
    public Object getProxyInstance() {

        //创建一个工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类对象，即代理对象
        return enhancer.create();

    }

    //重写 intercept 方法会调用目标对象的方法
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        System.out.println("Cglib 开始代理 ...");

        Object invoke = method.invoke(target, args);

        System.out.println("Cglib 代理结束 ...");
        return invoke;
    }
}
