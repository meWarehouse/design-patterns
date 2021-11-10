package com.at.designpattern.factory.simplefactory.order;

import com.at.designpattern.factory.Pizza;
import com.at.designpattern.factory.simplefactory.pizza.CheesePizz;
import com.at.designpattern.factory.simplefactory.pizza.PepperPizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zero
 * @create 2020-11-17 18:53
 */
public class OrderPizza {


    //普通模式

    /*public OrderPizza() {

        Pizza pizza = null;
        do {

            String type = getType();
            if (type.equals("cheek")) {
                pizza = new CheesePizz();
                pizza.setName(type);
            } else if (type.equals("cheese")) {
                pizza = new CheesePizz();
                pizza.setName(type);
            } else if (type.equals("pepper")) {
                pizza = new PepperPizza();
                pizza.setName(type);
            }else {
                System.out.println("--------------退出订购------------");
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        } while (true);
    }*/



    SimpleFactory simpleFactory;
    Pizza pizza;

    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    //使用工厂方式创建Pizza类 当有新的Pizza增加时，就无需改变当前订Pizza的类只需改变工厂的方法
    public void setFactory(SimpleFactory factory){
        this.simpleFactory = factory;
        do {
            String type = getType();
            Pizza pizza = simpleFactory.createPizza(type);
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("pizza 失败..................");
                break;
            }
        }while (true);
    }


    /**
     * 接收键盘录入并返回
     * @return
     */
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
