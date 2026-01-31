package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorinJava {

	public static void main(String[] args) {
		 ArrayList al=new ArrayList();
		 	al.add(100);
			al.add(50);
			al.add(150);
			al.add(25);
			al.add(75);
			al.add(125);
			al.add(175);
			
			al.toStri
		
			String s="arsh";
			Iterator itr=al.iterator();
		 
			while (itr.hasNext()) {
				System.out.print(itr.next()+" ");	
			}
	}
}
