package duty;

class Parent{
	 void disp() {
		System.out.println("this is parent method");
	}
}
class child extends Parent{
	void disp() {
		System.out.println("this is child");
	}
}
public class ParentApp {
	public static void main(String[] args) {
		Parent p=new Parent();
		p.disp();
		child c=new child();
		c.disp();
		Parent p1=new child();
		p1.disp();
	}
}
