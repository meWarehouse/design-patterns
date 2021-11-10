package com.at.designpattern.responsibility;

/**
 * @author zero
 * @create 2020-11-21 19:57
 */
public class CollegeApprover extends Approver {

    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPurchasePrice() > 5000 && purchaseRequest.getPurchasePrice() <=1000){
            System.out.println(this.name+" 处理：id="+purchaseRequest.getId() + "\t price="+purchaseRequest.getPurchasePrice());
        }else{
            approver.processRequest(purchaseRequest);
        }
    }
}
