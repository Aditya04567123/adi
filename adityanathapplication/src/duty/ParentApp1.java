package duty;
class Parent1 {
    static void disp() {
        System.out.println("this is Parent class");
    }
}	
class Child1 extends Parent1 {
    static void disp() {
        System.out.println("this is child");
    }
}
public class ParentApp1 {

    public static void main(String[] args) {
        Parent1 p3 = new Parent1();
        p3.disp(); 
        Child1 c1 = new Child1();
        c1.disp(); 
        Parent1 p2 = new Child1();
        p2.disp(); 
    }
}
