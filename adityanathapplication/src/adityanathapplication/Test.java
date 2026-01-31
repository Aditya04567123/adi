package adityanathapplication;

import java.util.Scanner;

public class Test{
    public static void main(String[] args){
    	System.out.println("enter any no");
    	Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x>=0) {
    	   if(x==0)
    	   {
    		   System.out.println("Entered no is zero");
    	   }
    	   else
    	   {
    		   System.out.println("Entered no is positive");
    	   }
       }else {
    	   System.out.println("Entered no is negative");
       }
        sc.close();
    }
}
