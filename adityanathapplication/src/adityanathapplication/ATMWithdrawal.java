package adityanathapplication;

import java.util.Scanner;

public class ATMWithdrawal {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter balance:");
		double balance=scanner.nextDouble();
		System.out.println("enter withdrawal amount");
		double Withdrawalamount=scanner.nextDouble();
		if(Withdrawalamount<=balance) {
			balance-=Withdrawalamount;
			System.out.println("withdrawal successfully remainong balance:"+balance);
		}else {
			System.out.println("Insufficient balance");
		}
		scanner.close();
	}

}
