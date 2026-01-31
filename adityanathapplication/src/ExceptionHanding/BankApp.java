package ExceptionHanding;
import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		 Bank b=new Bank();
		 b.banking();

	}
}
class Bank{
	void banking() {
		System.out.println("bank connection established");
		ATM card=new ATM();
		card.transaction();
		try {
			
		}catch(Exception e) {
			System.out.println("info received by the bank your ");
		}
		System.out.println("Bank connection terminated");
	}
}
class ATM{
	void transaction() throws Exception {
		System.out.println("ATM connection established");
		Scanner Input=new Scanner(System.in);
		System.out.println("Please enter v1");
		int a=input.nextInt();
		System.out.println("Please enter v2:");
		int b=input.nextInt();
		try {
			int c=a/b;
			System.out.println(c);
		}catch(Exception e){   
			System.out.println("exception handled by atm");
			throw e;
			
		}
		finally {
		System.out.println("atm connection terminated");
		}
	}
}
