package ExceptionHanding;

import java.util.Scanner;
public class exceptionDemoApp {
	public static void main(String[] args) {
		  System.out.println("connection established");
		  Scanner sc=new Scanner(System.in);
		  System.out.println("please enter value:");
		  int a=sc.nextInt();
		  System.out.println("please value 2 to divide");
		  int b=sc.nextInt();
		  try {
			  int c=a/b;
			  System.out.println(c);
		  }catch(Exception e) {
			  System.out.println("exception handled e");
		  }
		  System.out.println("connection terminated");
	}
}