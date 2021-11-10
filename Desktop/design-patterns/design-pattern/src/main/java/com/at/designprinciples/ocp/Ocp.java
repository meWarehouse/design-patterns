package com.at.designprinciples.ocp;

/**
 * @author zero
 * @create 2020-11-17 11:12
 * 1) 开闭原则（Open Closed Principle）是编程中最基础、最重要的设计原则
 * 2) 一个软件实体如类，模块和函数应该对扩展开放(对提供方)，对修改关闭(对使用 方)。用抽象构建框架，用实现扩展细节。
 * 3) 当软件需要变化时，尽量通过扩展软件实体的行为来实现变化，而不是通过修改已 有的代码来实现变化。
 * 4) 编程中遵循其它原则，以及使用设计模式的目的就是遵循开闭原
 */
public class Ocp {
    public static void main(String[] args) {

        GraphicEditor graphicEditor = new GraphicEditor();

        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());

    }
}

class GraphicEditor {

    //接收一个shap对象，根据type类绘制不同的图形
    public void drawShape(Shape s) {
        if (s.m_type == 1) drawRectangle(s);
        else if (s.m_type == 2) drawCircle(s);
        else if (s.m_type == 3) drawTriangle(s);
    }

    private void drawTriangle(Shape s) {
        System.out.println("绘制三角形");
    }

    private void drawCircle(Shape s) {
        System.out.println("绘制圆形");
    }

    private void drawRectangle(Shape s) {
        System.out.println("绘制长方形");
    }
}

class Shape {
    int m_type;
}

class Rectangle extends Shape {
    public Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    public Circle() {
        super.m_type = 2;
    }
}

class Triangle extends Shape {
    public Triangle() {
        super.m_type = 3;
    }
}

