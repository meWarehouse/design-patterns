package com.at.designpattern.responsibility;

/**
 * @author zero
 * @create 2020-11-21 19:57
 */
public class DepartmentApprover extends Approver {

    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPurchasePrice() <= 5000){
            System.out.println(this.name+" 处理：id="+purchaseRequest.getId() + "\t price="+purchaseRequest.getPurchasePrice());
        }else{
            approver.processRequest(purchaseRequest);
        }
    }
}
