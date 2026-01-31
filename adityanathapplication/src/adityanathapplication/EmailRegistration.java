package adityanathapplication;
import java.util.HashSet;
import java.util.Set;
public class EmailRegistration {
	public static void main(String[] args) {
		Set<String>emails=new HashSet<>();
		emails.add("aditya1@gmail.com");
		emails.add("aditya2@gmail.com");
		emails.add("aditya3@gmail.com");
		System.out.println("Registered emails");
	
		for(String email:emails) {
			System.out.println(emails);
		}
	}
}

	

