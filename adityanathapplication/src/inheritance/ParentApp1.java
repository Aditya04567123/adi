package inheritance;

public class ParentApp1 {
    public static void main(String[] args) {
        Child1 c = new Child1();
    }
}
class Parent1{
    public Parent1() {
        System.out.println("This is a parent constructor called");
    }
}
class Child1 extends Parent1{
    public Child1() {
        System.out.println("This is a child constructor called");
    }
}

		
	

		
