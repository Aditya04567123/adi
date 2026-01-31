package adityanath;

public class Employee10 {
    int emp_id;
    String name;
    int salary;

    public Employee10() {
    	
    	this(101,"arsh",20);
        System.out.println("0 parameter is called");
    }

    public Employee10(int emp_id) {
    
        System.out.println("1 parameter is called");
    }

    public Employee10(int emp_id, String name) {
    	this(101);
        System.out.println("2 parameter is called");
    }

    public Employee10(int emp_id, String name,int salary) {
        this(111, "arsh");
        System.out.println("3 parameterized constructor is called");
    }
   
}   
 public class Employee10{
    public static void main(String[] args) {
        Employee10 e = new Employee10();
     
     }
    }

