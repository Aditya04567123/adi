package adityanath;

import java.util.Scanner;

public class Electricitybill {

	public static void main(String[] args) {
		int units,bill;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter units consumed:");
		units=sc.nextInt();
		if(units>=1 && units<=100) {
			bill=units*3;
			System.out.println("bill is $:"+bill);
		}else if(units>=101 && units<=300){
			bill=(100*3)+(units-100)*5;
			System.out.println("Bill is $:"+bill);
		}else {
			bill=(100*3)+(200*5)+(units-300)*7;
			System.out.println("Bill is $:"+bill);
		}
		sc.close();
	}
}
