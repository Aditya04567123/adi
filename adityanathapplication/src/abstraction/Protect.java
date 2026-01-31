package abstraction;

public class Protect {
	public static void main(String[] args) {
		System.out.println("<<<<<<<<<Army>>>>>>>>>>>>>>>>>");
		duty(new Army());
		System.out.println();
		System.out.println("<<<<<<<<<<Navy>>>>>>>>>>>>>>>>");
		duty(new Navy());
		System.out.println();
		System.out.println("<<<<<<<<<<<<<<AirWay>>>>>>>>>>>");
		duty(new AirForce());
}
static void duty(SecurityForce sf) {
		sf.Protect();
	}
}
abstract class SecurityForce{
	abstract void Protect();
}
class Army extends SecurityForce{
	void useTank() {
		System.out.println("Army use tank");
	}
	void Protect() {
		System.out.println("Protect land");
	}
}
class Navy extends SecurityForce{
	void useShip() {
		System.out.println("navy use ship");
	}
	void Protect() {
		System.out.println("protect sea borders");
	}
}
class AirForce extends SecurityForce{
	void useJet() {
		System.out.println("AirForce use Jets");
	}
	void Protect() {
		System.out.println("protect sky");
	}
}