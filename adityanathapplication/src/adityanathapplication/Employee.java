package adityanathapplication;

 class EmployeeClass {
    static String companyName = "TCS";
    final int empId;
    String name;
    double salary;

    EmployeeClass(int empId, String name, double salary) {
        this.empId = empId;    // initialize using this
        this.name = name;
        this.salary = salary;
    }
}

class Manager extends EmployeeClass {
    String department;

    Manager(int empId, String name, double salary, String department) {
        super(empId, name, salary);   // use super
        this.department = department;
    }

    void display() {                  // print details
        System.out.println("Company: " + companyName);
        System.out.println("ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

class Employee {   // this class contains main
    public static void main(String[] args) {
        Manager m = new Manager(201, "Rahul", 80000, "IT"); // create Manager object
        m.display();
    }
}

