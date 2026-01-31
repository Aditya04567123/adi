package iterator;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class test {

    public static void main(String[] args) {

        CopyOnWriteArrayList al = new CopyOnWriteArrayList();
        al.add(100);
        al.add(50);
        al.add(150);
        al.add(25);
        al.add(75);
        al.add(125);
        al.add(175);

        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
            al.add(50);
        }
    }
}

