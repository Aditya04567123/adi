package inheritance;

public class ParentApp2 {
    public static void main(String[] args) {
        Child2 c = new Child2();
        System.out.println(c.a); // inherited from GrandParent
        System.out.println(c.b); // inherited from Parent3
    }
}

class GrandParent {
    int a = 10;
}

class Parent3 extends GrandParent {
    int b = 20;
}

class Child2 extends Parent3 {
    // Child inherits a from GrandParent and b from Parent3
}

