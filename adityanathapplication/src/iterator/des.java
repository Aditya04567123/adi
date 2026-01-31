package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class des {
	
	 public static void main(String[] args) {
		 	LinkedList al = new LinkedList();
			al.add(100);
			al.add(50);
			al.add(150);
			al.add(25);
			al.add(75);
			al.add(125);
			al.add(175);
			
			
			 Iterator litr = al.descendingIterator();
			 
			 while (litr.hasNext()) {
				 System.out.print(litr.next() + " ");
			 }
	}

}
