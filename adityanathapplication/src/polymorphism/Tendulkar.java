package polymorphism;

public class Tendulkar {
	public static void main(String[] args) {
		Tendulkar1 t=new ArjunTendulkar();
		t.Job();
		t.profession();
		 ((ArjunTendulkar) t).smoke(); //t.smoke();
	}
}
class Tendulkar1{
	void Job() {
		System.out.println("play cricket");
	}
	void profession() {
		System.out.println("he is batsman");
	}
}
class ArjunTendulkar extends Tendulkar1{
	void profession() {
		System.out.println("he is baller");
	}
	void smoke() {
		System.out.println("he smoke some time");
	}
}

