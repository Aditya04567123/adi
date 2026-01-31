package inheritance;

public class ParentApp {
	public static void main(String[] args) {
		Child c=new Child();
	}
}
class Parent{
	int a=10;
	public Parent() {
		System.out.println("this is parent constructor");
	}
}
class Parent2{
	int b=20;
	public Parent2() {
		System.out.println("this is parent constructor");
	}
	
}
class Child extends Parent,Parent2{
	public Child() {
		System.out.println("this is child constructor");
	}
}

