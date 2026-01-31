package polymorphism;

public class Tendulkarr {

	public static void main(String[] args) {
		Tendulkarrr t=new ArjunTendulkarr();
		t.Job();
		t.profession();
		//t.smoke();
	}
}

class Tendulkarrr {
    void Job() {
        System.out.println("play cricket");
    }

    void profession() {
        System.out.println("he is batsman");
    }
}

class ArjunTendulkarr extends Tendulkarrr {
    void profession() {
        System.out.println("he is baller");
    }

    void smoke() {
        System.out.println("he smoke some time");
    }
}
