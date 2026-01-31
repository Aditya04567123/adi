package com.company.Employees;

public class Manager extends Employees {
    public Manager(int empId, double salary, String deptName, String empPassword) {
        super(empId, salary, deptName, empPassword);
    }

    void accessEmployeeData(){
        System.out.println("Id : "+this.empId);
//        System.out.println("Name : "+this.deptName);  default cannot access in other package
        System.out.println("Salary : "+this.salary);
//        System.out.println("Password : "+this.empPassword); this is private
    }

    public static void main(String[] args) {
        Manager m = new Manager(1,5000,"IT","John");
        m.accessEmployeeData();
        m.showEmpDetails();
    }
}
