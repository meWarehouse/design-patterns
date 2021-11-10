package com.at.designpattern.singletone.type2;

/**
 * @author zero
 * @create 2020-11-17 16:34
 * <p>
 * 1) 构造器私有化 (防止 new )
 * 2) 类的内部创建对象
 * 3) 向外暴露一个静态的公共方法。getInstance 4
 * ) 代码实现
 */
public class SingletoneTest {
}

/**
 * 缺点
 * 1)	起到了 Lazy Loading 的效果，但是只能在单线程下使用。
 * 2)	如果在多线程下，一个线程进入了 if (singleton == null)判断语句块，还未来得及往下执行，
 *      另一个线程也通过了这个判断语句，这时便会产生多个实例。所以在多线程环境下不可使用这种方式
 * 3)	结论：在实际开发中，不要使用这种方式
 */
class SingleTone {

    private SingleTone() {
    }

    private static SingleTone instance;

    public static SingleTone getInstance() {
        if (instance == null) {
            instance = new SingleTone();
        }
        return instance;
    }

}

/**
 * 1)	Double-Check 概念是多线程开发中常使用到的，如代码中所示，我们进行了两次 if (singleton == null)检查，这样就可以保证线程安全了。
 * 2)	这样，实例化代码只用执行一次，后面再次访问时，判断 if (singleton == null)，直接 return 实例化对象，也避免的反复进行方法同步.
 * 3)	线程安全；延迟加载；效率较高
 * 4)	结论：在实际开发中，推荐使用这种单例设计模式
 */
class SingleTone1 {

    private SingleTone1() {
    }

    private static volatile SingleTone1 instance;

    public static SingleTone1 getInstance() {
        if (instance == null) {
            synchronized (SingleTone1.class) {
                if (instance == null) {
                    instance = new SingleTone1();
                }
            }
        }
        return instance;
    }

}

/**
 * 1)	解决了线程安全问题
 * 2)	效率太低了，每个线程在想获得类的实例时候，执行 getInstance()方法都要进行同步。而其实这个方法只执行一次实例化代码就够了，
 * 后面的想获得该类实例，直接 return 就行了。方法进行同步效率太低
 * 3)	结论：在实际开发中，不推荐使用这种方式
 */
class SingleTone2 {

    private SingleTone2() {
    }

    private static volatile SingleTone2 instance;

    public synchronized static SingleTone2 getInstance() {

        if (instance == null) {
            instance = new SingleTone2();
        }

        return instance;
    }
}

/**
 * 1) 这种方式采用了类装载的机制来保证初始化实例时只有一个线程。
 * 2) 静态内部类方式在 Singleton 类被装载时并不会立即实例化，而是在需要实例化时，调用 getInstance 方法，才会装载 SingletonInstance 类，从而完成 Singleton 的实例化。
 * 3)	类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM 帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
 * 4)	优点：避免了线程不安全，利用静态内部类特点实现延迟加载，效率高
 * 5)	结论：推荐使用.
 */
class SingleTone3 {

    private SingleTone3() {
    }

    /**
     * 静态内部类
     * 1.在外部类加载是内部类不会加载
     * 2.内部被调用时才会被加载，并且只会别加载一次
     */
    private static class SingletoneInstance {
        private static final SingleTone3 INSTANCE = new SingleTone3();
    }

    public static synchronized SingleTone3 getInstance() {
        return SingletoneInstance.INSTANCE;
    }
}

/**
 * 1)	这借助 JDK1.5 中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
 * 2)	这种方式是 Effective Java 作者 Josh Bloch 提倡的方式
 * 3)	结论：推荐使用
 */
enum SingleTone4 {

    INSTANCE;


}