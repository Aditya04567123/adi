package multithreading;

public class kodeditor3 {
	public static void main(String[] args) {
		Thread t1=new Thread(new Typing1());
		Thread t2=new Thread(new Typing1());
		Thread t3=new Thread(new Typing1());
		t1.start();
		t2.start();
		t3.start();
	}
}
class Typing1 implements Runnable{
	public void run() {
		for (int i=0;i<10;i++) {
			System.out.println("hello from typing 1");
			try {                                                        
				Thread.sleep(3000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Saving1 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("hello from savings");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
