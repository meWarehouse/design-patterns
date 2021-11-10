package com.at.designpattern.factory;

import lombok.Getter;
import lombok.Setter;

/**
 * @author zero
 * @create 2020-11-17 18:48
 */
public abstract class Pizza {

    @Getter
    @Setter
    private String name;

    public abstract void prepare();

    public void bake() {
        System.out.println(name + "--> 烘烤");
    }

    public void cut() {
        System.out.println(name + "--> 切割");
    }

    public void box() {
        System.out.println(name + "--> 打包");
    }

}
