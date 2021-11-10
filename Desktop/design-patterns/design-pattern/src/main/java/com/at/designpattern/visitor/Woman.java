package com.at.designpattern.visitor;

/**
 * @author zero
 * @create 2020-11-19 21:45
 */
public class Woman extends Person {
    @Override
    void accept(Action action) {
        action.getRResult(this);
    }

    @Override
    void behavior() {

    }
}
