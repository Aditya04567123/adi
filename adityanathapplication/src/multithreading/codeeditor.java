package multithreading;
public class codeeditor {
	public static void main(String[] args) {
		codeeditor t1=new codeeditor();
		codeeditor t2=new codeeditor();
		codeeditor t3=new codeeditor();	
		t1.setName("Type");
		t2.setName("Spell");
		t3.setName("Save");
		t1.start();
		t2.start();
		t3.start();	
	}
}
class codeeditor1 extends Thread{
	public void run() {
		String tName=Thread.currentThread().getName();
		if(tName.equals("type")) {
			typing();
		}
		else if(tName.equals("spell")){
				 SpellCheck();
	}else {
		
	}
	void typing() {
		for(int i=0;i<10;i++) {
			System.out.println("hello from typing1");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
				
			}
		}
	}
	void Spellcheck() {
		for(int i=0;i<10;i++) {
			System.out.println("hello from spellcheck");
			try {
				Thread.sleep(1000);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
