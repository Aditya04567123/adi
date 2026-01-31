package ExceptionHanding;
import java.util.Scanner;

public class BankApp1 {

	public static void main(String[] args) {
		 Bankk b=new Bankk();
		 b.banking();

	}
}
class Bankk{
	void banking() {
		Atm3 a=new Atm3();
		
		try {
			a.acceptinfo();
			a.verify();
		}catch(InvlaidInputException e) {
			System.out.println("Wrong pin");
			System.out.println("Attempt 2");
			try {
				a.acceptinfo();
				a.verify();
			}catch(InvlaidInputException e1) {
				System.out.println("wrong pin");
				System.out.println("final attempt");
				try { 
					a.acceptinfo();
					a.verify();
				}catch(InvlaidInputException e2) {
					System.out.println("your atm is blocked for 24 hrs");
				}
			}
		}
	}
}
class Atm3{
	int acc_no=123456;
	int pass=1234;
	int user_acc;
	int user_pass;
	void  acceptinfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your acc_no");
		user_acc=sc.nextInt();
		System.out.println("please enter your pass");
		user_pass=sc.nextInt();
		sc.close();
		
		
	}
	void verify() throws InvlaidInputException{
		if(acc_no==user_acc && pass==user_pass) {
			System.out.println("collect your cash");
		}else {
			InvlaidInputException e=new InvlaidInputException();
			throw e;
		}
		
	}
}
class InvlaidInputException extends Exception
{
	public String getMessage() {
		return "wrong credentials";
	}
}