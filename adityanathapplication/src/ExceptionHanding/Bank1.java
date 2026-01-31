package ExceptionHanding;
import java.util.Scanner;

public class Bank1{
	int acc_no=12356798;
	String password="aditya#423%";
	int user_acc;
	int user_password;
		
	
	void accept_info() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter account no and password");
		user_acc=sc.nextInt();
		user_password=sc.nextInt();
	}
	void verify() {
		if((acc_no==user_acc)&&(password.equals(user_password))) {
			System.out.println("collect your cash");
		}else {
			System.out.println("login failed");
		}
	}
}
	

	
