package ExceptionHanding;
import java.util.Scanner;
public class exceptionDemoapp1 {

	public static void main(String[] args) {
		try {
			System.out.println("connection established");
			Scanner sc=new Scanner(System.in);
			System.out.println("please enter value 1");
			int a=sc.nextInt();
			System.out.println("please value 2 to divide");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
			System.out.println("please enter size of an array");
			int size=sc.nextInt();
			int arr[]=new int[size];
			System.out.println("please enter index no.array");
			int n=sc.nextInt();
			arr[n]=999;
		}catch(Exception e) {
			System.out.println("divide by zero is not allowed");
		}
		System.out.println("connection terminated");
		// TODO Auto-generated method stub

	}

}
