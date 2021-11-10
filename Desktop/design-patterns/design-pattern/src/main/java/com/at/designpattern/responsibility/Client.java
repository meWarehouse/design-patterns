package com.at.designpattern.responsibility;

/**
 * @author zero
 * @create 2020-11-21 20:02
 */
public class Client {
    public static void main(String[] args) {

        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 2000);

        //创建审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("部门");
        CollegeApprover collegeApprover = new CollegeApprover("院");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("副校");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("校长");

        //设置下一个审批者
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);

//        departmentApprover.processRequest(purchaseRequest);
        schoolMasterApprover.processRequest(purchaseRequest);




    }
}
