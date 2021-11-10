package com.at.designprinciples.dependenceinversion.improver;

/**
 * @author zero
 * @create 2020-11-17 9:09
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Persion persion = new Persion();

        persion.receive(new Email());
        persion.receive(new WeiX());
    }
}

interface IReceive {
    String getInfo();
}

class Email implements IReceive {
    public String getInfo() {
        return "Email 信息....";
    }
}

class WeiX implements IReceive {
    public String getInfo() {
        return "WeiX 信息....";
    }
}

class Persion {
    public void receive(IReceive iReceive) {
        System.out.println(iReceive.getInfo());
    }
}