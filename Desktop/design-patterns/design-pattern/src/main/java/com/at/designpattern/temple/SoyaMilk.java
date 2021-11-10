package com.at.designpattern.temple;

/**
 * @author zero
 * @create 2020-11-19 16:53
 */
//抽象类，表示豆浆
public abstract class SoyaMilk {

    //模板方法，make，做成final，放置子类覆盖
    final void make() {

        select();
        //需要添加是就添加
        if (addWantCondiments()) {
            addCondiments();
        }
        soak();
        beat();

    }

    void select() {
        System.out.println("第一步：选取材料...");
    }

    //添加不同的配配料，具体实现交由子类完成
    abstract void addCondiments();

    void soak() {
        System.out.println("第三步：浸泡3小时");
    }

    void beat() {
        System.out.println("第四步：打磨");
    }

    //钩子方法
    boolean addWantCondiments() {
        return true;
    }


}
