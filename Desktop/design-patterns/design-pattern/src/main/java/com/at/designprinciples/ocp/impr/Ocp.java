package com.at.designprinciples.ocp.impr;

/**
 * @author zero
 * @create 2020-11-17 11:12
 */
public class Ocp {
    public static void main(String[] args) {

        GraphicEditor graphicEditor = new GraphicEditor();

        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Trangle());

    }
}

class GraphicEditor {
    //接收一个shap对象，根据type类绘制不同的图形
    public void drawShape(Shape s) {
        s.draw();
    }
}

abstract class Shape {
    public abstract void draw();
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("绘制长方形");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

class Trangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Trangle");
    }
}

