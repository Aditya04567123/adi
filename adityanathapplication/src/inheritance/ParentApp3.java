package inheritance;

public class ParentApp3 {
    public static void main(String[] args) {
        Child2 c = new Child2();
        System.out.println(c.a+" "+c.b); 
    }
}
class Parent3{
	int a=0;
	int b=0;
	public Parent3() {
		a=10;
		b=10;
	}
	public Parent3(int a,int b) {
		this.a=a;
		this.b=b;
	}
}
class Child2 extends Parent3{
	public Child2() {
		a=20;
		b=10;
	}
	public Child2(int a,int b) {
		this();
		this.a=a;
		this.b=b;
	}
}
