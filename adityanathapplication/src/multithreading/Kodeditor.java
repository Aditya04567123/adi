package multithreading;

class Typing extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Typing...");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class spellcheck extends Thread{
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println("spellcheck..");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class saving extends Thread{
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println("saving...");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class Kodeditor {
	public static void main(String[] args) {
		Typing t1=new Typing();
		spellcheck t2=new spellcheck();
		saving t3=new saving();
		t1.start();
		t2.start();
		t3.start();	
		

	}

}
