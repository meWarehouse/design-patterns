package com.at.designprinciples.demeter.impr;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;


public class Demeter1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());

    }
}


@Data
class Employee {
    private String id;
}

@Data
class CollegeEmployee {
    private String id;
}

class CollegeManager {
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id=  " + i);
            list.add(emp);
        }
        return list;
    }

    public List<Employee> getEmployee() {
        List<Employee> list = new ArrayList<Employee>();

        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId("学校总部员工id= " + i);
            list.add(emp);
        }
        return list;
    }
}


class SchoolManager {

    void printAllEmployee(CollegeManager sub) {

        List<CollegeEmployee> list1 = sub.getAllEmployee();
        System.out.println("------------分公司员工------------");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
        List<Employee> list2 = sub.getEmployee();
        System.out.println("------------学校总部员工------------");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}
