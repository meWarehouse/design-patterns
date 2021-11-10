package com.at.designpattern.interpreter;

import java.util.HashMap;

//抽象里表达式 通过HashMap键值对获取变量的值
public abstract class Expression {

    // a+b
    //解释器和数值，key就是公式(表达式)参数[a,b]，value就是具体的值
    //HashMap{a=10,b=20}
    public abstract int interpreter(HashMap<String, Integer> var);
}
