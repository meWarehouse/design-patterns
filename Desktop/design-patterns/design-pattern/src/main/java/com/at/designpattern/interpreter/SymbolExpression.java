package com.at.designpattern.interpreter;

import java.util.HashMap;

/**
 * 抽象运算符号解释器，每一个运算符号都只和自己左右两个数字有关<br/>
 * 但是左右两个数字可能也是一个解析的结果，无论何种类型，都是Exception 类的子类<br/>
 */
public class SymbolExpression extends Expression {

    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    //因为 SymbolExpression 是让其子类来实现，因此 interpreter 是一个默认实现
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        // TODO Auto-generated method stub
        return 0;
    }
}
