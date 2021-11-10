package com.at.designpattern.responsibility;

/**
 * @author zero
 * @create 2020-11-21 19:54
 */
//抽象的处理者
public abstract class Approver {

    //下一个处理者
    Approver approver;
    String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    //处理审批请求，获取一个请求，具体的处理者由子类完成
    public abstract void processRequest(PurchaseRequest purchaseRequest);

}
