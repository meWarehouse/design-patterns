package com.at.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author zero
 * @create 2020-11-17 23:52
 */
public class ProtoType {
    public static void main(String[] args) {
        // create and configure beans
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("bean.xml");

        Object monster = applicationContext.getBean("Monster");
        System.out.println(monster);

        Object monster1 = applicationContext.getBean("Monster");
        System.out.println(monster1);

        System.out.println(monster == monster1);

    }
}
