package inheritance;

public class ParentApp4 {
	public static void main(String[] args) {
		  Child3 c=new Child3();
		  c.disp();
	}
}
class Parent4{
	 void disp() {
		System.out.println("this is parent method");
	}
}
class Child3 extends Parent4{
	int disp() {
		System.out.println("this is class method");
		return 0;
	}
}

