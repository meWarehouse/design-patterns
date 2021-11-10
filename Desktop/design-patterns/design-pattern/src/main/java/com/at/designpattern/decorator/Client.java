package com.at.designpattern.decorator;

/**
 * @author zero
 * @create 2020-11-18 21:30
 */
public class Client {
    public static void main(String[] args) {

        //driver 是被装饰者

        //2份巧克力+一份牛奶的LongBlack

        Drink order = new LongBlack();
        System.out.println("费用1="+order.cost());
        System.out.println("描述："+order.getDes());

        //order 加入一份牛奶
        order = new Milk(order);
        System.out.println("费用 加入一份牛奶2="+order.cost());
        System.out.println("描述 加入一份牛奶："+order.getDes());

        //加入一份Soy
        order = new Soy(order);
        System.out.println("费用 加入一份牛奶 加入一份Soy 3="+order.cost());
        System.out.println("描述 加入一份牛奶 加入一份Soy："+order.getDes());

        //加入一份chocolate
        order = new Chocolate(order);
        System.out.println("费用 加入一份牛奶 加入一份Soy 加入一份chocolate 4="+order.cost());
        System.out.println("描述 加入一份牛奶 加入一份Soy 加入一份chocolate："+order.getDes());


    }
}
