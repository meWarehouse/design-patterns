package com.at.designpattern.bridge;

/**
 * @author zero
 * @create 2020-11-18 19:38
 */
public class Client {
    public static void main(String[] args) {

        FoldedPhone foldedPhone = new FoldedPhone(new XiaoMi());

        foldedPhone.open();
        foldedPhone.call();
        foldedPhone.close();

        System.out.println("------------------------------------------");

        FoldedPhone vivo = new FoldedPhone(new Vivo());

        vivo.open();
        vivo.call();
        vivo.close();

        System.out.println("------------------------------------------");

        SliedPhone ximiPhone = new SliedPhone(new XiaoMi());
        ximiPhone.open();
        ximiPhone.call();
        ximiPhone.close();

        System.out.println("------------------------------------------");

        SliedPhone sliedPhone = new SliedPhone(new Apple());
        sliedPhone.open();
        sliedPhone.call();
        sliedPhone.close();

    }
}
