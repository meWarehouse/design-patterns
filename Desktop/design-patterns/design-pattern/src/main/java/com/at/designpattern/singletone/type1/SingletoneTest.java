package com.at.designpattern.singletone.type1;

/**
 * @author zero
 * @create 2020-11-17 16:34
 * <p>
 * 1) 构造器私有化 (防止 new )
 * 2) 类的内部创建对象
 * 3) 向外暴露一个静态的公共方法。getInstance
 * 4) 代码实现
 */
public class SingletoneTest {
}

/**
 * 优缺点说明：
 * 1) 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同 步问题。
 * 2) 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始 至终从未使用过这个实例，则会造成内存的浪费
 * 3) 这种方式基于classloder机制避免了多线程的同步问题，不过，instance在类装载 时就实例化，在单例模式中大多数都是调用getInstance方法，
 * 但是导致类装载 的原因有很多种，因此不能确定有其他的方式（或者其他的静态方法）导致类 装载，这时候初始化instance就没有达到lazy loading的效果
 * 4) 结论：这种单例模式可用，可能造成内存浪
 */
class SingleTone {

    //构造器私有化
    private SingleTone() {
    }

    //创建一个内部的静态实例
    private final static SingleTone instance = new SingleTone();

    //向外暴露方法获取静态实例
    public static SingleTone getInstance() {
        return instance;
    }

}

class SingleTone1 {

    private SingleTone1() {
    }

    private static SingleTone1 instance;

    static {
        instance = new SingleTone1();
    }

    public static SingleTone1 getInstance() {
        return instance;
    }

}
