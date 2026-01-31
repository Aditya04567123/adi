package adityanathapplication;

import java.util.Scanner;

public class studentgrade {

	public static void main(String[] args) {
		System.out.println("Enter any number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>=90 && a<100) {
			System.out.println("you got A grade");
		}else if(a>=75 && a<90) {
			System.out.println("you got B grade");
		}else if(a>=60 && a<75) { 
			System.out.println("you got C grade");
		}else {
			System.out.println("Fail");
		}
		sc.close();
	}

}
