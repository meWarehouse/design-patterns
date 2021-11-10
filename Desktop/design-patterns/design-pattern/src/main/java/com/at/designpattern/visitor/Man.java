package com.at.designpattern.visitor;

/**
 * @author zero
 * @create 2020-11-19 21:45
 *
 */
public class Man extends Person {

    /**
     * 这里使用到了双分派么，
     *      即首先在客户端程序中，将具体状态作为参数传递Man(第一次传递)
     *      然后Man类调用作为参数的"具体方法"中方法getRResult，同时将自己作为参数传入，完成第二次分派
     *
     * @param action
     */
    @Override
    void accept(Action action) {
//        action.getRResult(this);
    }

    @Override
    void behavior() {

    }
}
