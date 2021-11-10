package com.at.designprinciples.dependenceinversion.improver;

public class DependencyPass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}

//接口
//interface IOpenAndClose {
//    public void open(ITV tv);
//}
//
//interface ITV {
//    public void play();
//}
//
//class OpenAndClose implements IOpenAndClose {
//    public void open(ITV tv) {
//        tv.play();
//    }
//}

//interface IOpenAndClose {
//    public void open();
//}
//
//interface ITV {
//    public void play();
//}
//
//class OpenAndClose implements IOpenAndClose {
//    public ITV tv;
//
//    public OpenAndClose(ITV tv) { //构造器
//        this.tv = tv;
//    }
//
//    public void open() {
//        this.tv.play();
//    }
//}

interface IOpenAndClose {
    public void open();

    public void setTv(ITV tv); //setter
}

interface ITV { // ITV�ӿ�
    public void play();
}

class OpenAndClose implements IOpenAndClose {
    private ITV tv;

    public void setTv(ITV tv) {
        this.tv = tv;
    }

    public void open() {
        this.tv.play();
    }
}