package multithreading;

public class Kodeditor2 {
	
	public static void main(String[] args) {
		
		
		working(new Typing());
		working(new spellcheck());
		working(new saving());
		
		
	}
	
	static void working(Thread t) {
		t.start();
	}

}


