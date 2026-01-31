package adityanathapplication;

import java.util.Scanner;

public class Loginvalidation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String correctUsername="aditya";
		String correctPassword="12345";
		System.out.println("Enetr Username:");
		String Username=sc.nextLine();
		System.out.println("Enter Password:");
		String Password=sc.nextLine();
		if (Username.equals(correctUsername)&& Password.equals(correctPassword)) {
			System.out.println("login successful");
		}else {
			System.out.println("invalid Username & Password");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
