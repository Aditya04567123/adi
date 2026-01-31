package com.company.Employees;

public class Employees {
	public int empId=101;
	protected double salary=20000;
	String department ;
	private String empPassword ;

	public  Employees(int empId, double salary, String department,String empPassword) {
		this.department=department;
		this.salary=salary;
		this.empId=empId;
		this.empPassword =empPassword;
	}
	public void showEmpDetails() {
		System.out.println("empId:"+this.empId);
		System.out.println("salary"+this.salary);
		System.out.println("department"+this.department);
		System.out.println("empPassword"+this.empPassword);
		
		
	}

}

public class Employees{
	public int empId=101;
	protected double salary=1000;
	String department="IT";
	int empPassword=1234;
	
	public Employees(int empId,double salary,String department,int empPassword) {
		this.empId=empId;
		this.salary=salary;
		this.department=department;
		this.empPassword=empPassword;
	}
	public void showEmpDetails() {
		System.out.println("empId:"+empId);
		System.out.println("salary:"+salary);
		system.out.println("department:"+department);
		System.out.println("empPassword:"+empPassword);
	}
}
public class Employees{
	public int empId;
	protected int salary;
	String departmentname;
	private String empPassword;
	
	public Employees(int empId,int salary,String departmentname,String empPassword) {
		this.empId=empId;
		this.salary=salary;
		this.departmentname=departmentname;
		this.empPassword=empPassword;
	}
	public void showEmpDetails() {
		System.out,println("empId:"+empId);
		System.out.println("salary:"+salary);
		System.out.println("departmentname:"+departmentname);
		System.out.println("emoPassword:"+empPassword);
	}
}
