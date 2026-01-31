package adityanathapplication;

abstract class Employees {
    int id;
    String name;

    Employees(int id, String name) {
        this.id = id;
        this.name = name;
    }
    abstract double calculateSalary();
    void display() {
        System.out.println("Employee: " + name);
        System.out.println("Salary: " + calculateSalary());
        System.out.println();
    }
}
class FullTimeEmployee extends Employees {
    double monthlySalary;
    FullTimeEmployee(int id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }
    double calculateSalary() {
        return monthlySalary;
    }
}
class PartTimeEmployee extends Employees {
    int hoursWorked;
    double ratePerHour;

    PartTimeEmployee(int id, String name, int hoursWorked, double ratePerHour) {
        super(id, name);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }
    double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}
public class EmployeeDemo {
    public static void main(String[] args) {
        Employees[] employees = new Employees[2];
        employees[0] = new FullTimeEmployee(101, "Ravi", 45000);
        employees[1] = new PartTimeEmployee(102, "Amit",  120,200);

        for (Employees emp : employees) {
            emp.display();
        }
    }
}
abstract class Employees{
	int id;
	String name;
	
	Employees(int id,String name){
		this.id=id;
		this.name=name;
	}
	abstract double calculateSalary();
	void display() {
		System.out.println("Employee:"+name);
		System.out.println("Salary:"+calculateSalary());
		System.out.println();
	}
		
	}
abstract class Employees{
	int id;
	String name;
	
	Employees(int id,String name){
		this.id=id;
		this.name=name;
	}
	abstract double calculateSalary();
	void display() {
		System.out.println("Employee:"+name);
		System.out.println("Salary:"+calculatesalary());
		System.out.println();
	}
}
class PartTimeEployee Extends Employees{
	int hoursworked;
	double rateperhour;
	
	PartTimeEmployee(int id,String name,int hoursworked,double rateperhour){
		super(id,name);
		this.hoursworked=hoursWorked;
		this.rateperhour=rateperhour;
	}
	double calculateSalary() {
		return hoursWorked*rateperhour;
	}
}
class PartTimeEmployee extends Employee{
	int hoursworked;
	double rateperhour;
	
	PartTimeEmployee(int id,String name,int hoursworked,double rateperhour){
		super(id,name);
		this.hoursworked=hoursworked;
		this.rateperhour=rateperhour;
	}
	double CalculateSalary() {
		return hoursworked*rateperhour;
	}
}
class FullTimeEmployee extends Employee{
	double monthlysalary;
}
FullTimeEmployee(int id,String name,double monthlysalary){
	super(id,name)
	this.monthlysalary=monthlysalary;
}
doublecalculateSalary(){
	return monthlysalary;
}
public class EmployeeDemo{
	public static void main(String[] args) {
		Employees[] employee=s=new Employees[2];
		employees[0]=new FullTimeEmployees(1,"aditya",45000);
		employees[2]=new PartTimeEmployees(2,"aditya",120,200);
		
		for (Employees emp:employees) {
			emp.display();
		}
	}
}
public class EmployeeDemo{
	public static void main(String[] args) {
		Employees[] employees=new Employees[2];
		employees[0]=new FullTimeEmployees(101,"aditya",45000);
		employees[2]=new PartTimeEmployees(102,"aditya",120,200);
		
		for(Employees emp:employees) {
			emp.display();
		}
	}
}
