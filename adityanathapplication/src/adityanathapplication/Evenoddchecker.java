package adityanath;

import java.util.Scanner;

public class Evenoddchecker {

	public static void main(String[] args) {
		System.out.println("Enter any number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd number");
		}
		sc.close();
	}

}
