package iterator;

import java.util.ArrayList;

public class forEachInCollection {

	public static void main(String[] args) {
		
	ArrayList al = new ArrayList();
	al.add(100);
	al.add(50);
	al.add(150);
	al.add(25);
	al.add(75);
	al.add(125);
	al.add(175);
	
	System.out.println(al);
	System.out.println("for loop ->");
	
	for(int i = 0 ;i < al.size(); i++) {
		System.out.println(al.get(i)+ " ");
	}
	System.out.println();
	System.out.println("for each ->");
	for(Object x:al) {
		System.out.println(x+" ");
	}
	}

}
