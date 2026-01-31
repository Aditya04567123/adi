package adityanathapplication;

class Store {
    int item;
    boolean available = false;
    synchronized void produce(int value) {
        while (available) {
            try { wait(); } 
            catch (InterruptedException e) {}
        }
        System.out.println("Producer produced: " + value);
        item = value;
        available = true;
        notify();   // wake consumer
    }
    synchronized int consume() {
        while (!available) {
            try { wait(); } 
            catch (InterruptedException e) {}
        }

        System.out.println("Consumer consumed: " + item);
        available = false;

        notify();  // wake producer
        return item;
    }
}
class Producer extends Thread {
    Store s;
    Producer(Store s){ this.s = s; }
    public void run(){
        int i = 1;
        while(true) {
            s.produce(i++);
            try { Thread.sleep(500); } catch(Exception e){}
        }
    }
}
class Consumer extends Thread {
    Store s;
    Consumer(Store s){ this.s = s; }
    public void run(){
        while(true) {
            s.consume();
            try { Thread.sleep(1000); } catch(Exception e){}
        }
        
    }
}
public class Inter_Thread_Comm {
    public static void main(String[] args) {

        Store st = new Store();

        Producer p = new Producer(st);
        Consumer c = new Consumer(st);

        p.start();
        c.start();
    }
}
