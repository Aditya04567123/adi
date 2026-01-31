package multithreading;

public class codeditor {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Application Started");
		Thread t1=new Thread(new Typing());
		Thread t2=new Thread(new Typing());
		Thread t3=new Thread(new Typing());
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		System.out.println("Application terminated");
	}
}
class Typing2 implements Runnable{
	public void run() {
		System.out.println("Typing started.....");
		for(int i=0;i<10;i++) {	
			System.out.println("hello from typing 2");        
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Typing Terminated");
	}	
}
class SpellCheck2 implements Runnable{
	
	
}
