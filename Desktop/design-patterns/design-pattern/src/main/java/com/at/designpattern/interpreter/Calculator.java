package com.at.designpattern.interpreter;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {

    //表达式
    private Expression expression;

    public Calculator(String expStr) { //expStr=a+b
        Stack<Expression> stack = new Stack<>();
        char[] charArray = expStr.toCharArray(); //[a,+,b]

        Expression left = null;
        Expression right = null;
        //遍历数组 针对不同的情况做对应的处理
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    //从栈中取出left==>a
                    left = stack.pop();
                    //取出右表达式b
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    //然后根据得到的left和right构建一个AddException 加入栈中
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    //如果是一个 Var 就创建要给 VarExpression 对象，并 push 到 stack
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }
        this.expression = stack.pop();
    }

    public int run(HashMap<String, Integer> var) {
        //最后将表达式 a+b 和 var={a=10,b=20} 传递给exception的interpreter进行解释执行
        return this.expression.interpreter(var);
    }
}