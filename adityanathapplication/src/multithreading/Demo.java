package multithreading;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList AL=new ArrayList();
		AL.add(10);
		AL.add(20);
		AL.add(30);
		AL.add("Arsh");
		AL.add('A');
		AL.add(36.5);
		AL.add(true);
		System.out.println("List 1=>"+AL);
		ArrayList arr1=new ArrayList();
		arr1.add(10);
		arr1.add(20);
		arr1.add(30);
		arr1.add(40);
		System.out.println("List 2=>"+arr1);
		arr1.addAll(arr1);
		System.out.println("List 3=>"+arr1);
		arr1.add(1,99);
		System.out.println("List 1=>"+arr1);
		System.out.println(arr1.contains(50));
		arr1.remove(1);
		System.out.println("List 1=>"+arr1);
		
		

	}

}
