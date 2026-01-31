package inheritance;

    class Trainer1 {
	void Teacher() {
		System.out.println("Training something to students");
	}
}
class JavaTrainer extends Trainer1{
	void Teacher() {
		System.out.println("Teaching Java to students");
	}
}
class AptitudeTrainer extends Trainer1{
	void Teacher() {
		System.out.println("Teaching Aptitude to students");
	}
}
class TestingTrainer extends Trainer1{
	void Teacher() {
		System.out.println("Teaching Testing to students");
	}
}
public class Trainer{
	public static void main(String[] args) {
		JavaTrainer t1=new JavaTrainer();
		AptitudeTrainer t2=new AptitudeTrainer();
		TestingTrainer t3=new TestingTrainer();
		t1.Teacher();
		t2.Teacher();
		t3.Teacher();
	}
}