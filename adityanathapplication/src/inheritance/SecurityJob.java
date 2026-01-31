package inheritance;

class Security{
	public void job(){
		System.out.println("Protect the nation");
	}
	public void Protect() {
		System.out.println("protect the country");
	}
}
class Navy extends Security{
	void protect() {
		System.out.println("protect ocean");
	}
	public void UseTank() {
		System.out.println("navy uses Tanks");
	}
}
class Army extends Security{
	void protect() {
		System.out.println("Secure the land and borders");
	}
	public void UseTank() {
		System.out.println("Army uses Tanks");
	}
}
public class SecurityJob{
	public static void main(String[] args) {
		Army A1=new Army();
		A1.protect();
		Navy N1=new Navy();
		N1.protect();
		A1.UseTank();
		N1.UseTank();
	}
	
}