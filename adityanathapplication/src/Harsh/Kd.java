package Harsh;

public class Kd {
	
	public static void main(String[] args) {
		
		
		Thread t1 = new Thread(new Kde());
		Thread t2 = new Thread(new Kde());
		Thread t3 = new Thread(new Kde());
		
		t1.setName("Type");
		t2.setName("Spell");
		t3.setName("Save");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}

class Kde implements Runnable {
	
	void typing() {
		
		for(int i = 0 ; i <10 ; i++) {
			
			System.out.println("typ"
					+ "ing..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	void spellcheck() {
		
		for(int i = 0 ; i <10 ; i++) {
			System.out.println("spellcheck..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	void saving() {
		for(int i = 0 ; i <10 ; i++) {
			System.out.println("saving..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		
		if(tName.equals("Type")) {
			typing();
		}
		
		else if(tName.equals("Spell")) {
			spellcheck();
		}
		
		else {
			saving();
		}
		

		
	}
	
}






/*provide support or resouce to the primary thread run in the backgroud so to decleare a thread as deamon 
 *   we must follow the following steps 
 *   step1 use the setdeamon() 
 *    set it as true
 *   step2 set proirity of deamon thread as low 
 *   step 3 put the activities in to be performd by the deamon thread 
 *   inside an infinite loop 
 *   
 * 
 *   */


