package ExceptionHanding;
import java.util.Scanner;
public class TestApp {

	public static void main(String[] args) {
		System.out.println("main connection established");
		Test t=new Test();
		t.alpha();
		System.out.println("main connection terminated");
	}
}
class Test{
	void alpha() {
		System.out.println(" connection 1  established");
		Test1 t2=new Test1();
		t2.beta();
		System.out.println("connection1 terminated");
		
	}
	
}
class Test1{
	void beta() {
		System.out.println(" connection 2 established ");
		Test2 t3=new Test2();
		try {
		t3.gamma();
		}catch(Exception e){
			System.out.println("exception handled by beta");
		}
		System.out.println("connection 2 terminated");
	}
}
class Test2{
	void gamma() {
		System.out.println("connection 3 established");
		Scanner input=new Scanner(System.in);
		System.out.println("please enter value 1");
		int a=input.nextInt();
		System.out.println("please enter value 2");
		int b=input.nextInt();
		try {
		int c=a/b;
		System.out.println(c);
		}catch(Exception e) {
			System.out.println("exception handled by gama");
		}
		System.out.println("connection 3 terminated");
		input.close();
	}
}

