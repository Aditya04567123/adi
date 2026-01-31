package inheritance;

public class Parentaapp {

	public static void main(String[] args) {
		Parent c=new Child();
		c.disp();
	}
}
final class Parent{
	int x=10;
	void disp() {
		System.out.println("this is parent");
	}
}
class Child extends Parent{
	int x=20;
	
	
	
	
}
