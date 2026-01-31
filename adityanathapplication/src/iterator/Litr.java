package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Litr {
	 public static void main(String[] args) {
		 ArrayList al = new ArrayList();
			al.add(100);
			al.add(50);
			al.add(150);
			al.add(25);
			al.add(75);
			al.add(125);
			al.add(175);
			
			
			 ListIterator litr = al.listIterator(al.size());
			 
			 while (litr.hasPrevious()) {
				 System.out.print(litr.previous() + " ");
			 }
	}
}
