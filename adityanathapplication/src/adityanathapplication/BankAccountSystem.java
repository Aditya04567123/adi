package adityanathapplication;

import java.util.HashMap;
import java.util.Map;
public class BankAccountSystem {
	public static void main(String[] args) {
		Map<Integer,String>accounts=new HashMap<>();
		accounts.put(1001, "ravi");
		accounts.put(1002, "aditya");
		accounts.put(1003,"aditya");
		
		System.out.println("AccountDetails:");
		for(Map.Entry<Integer,String>entry:accounts.entrySet()) {
			System.out.println("Account no:"+entry.getKey());
		}
		System.out.println("\n Account Holder for 1002:"+accounts.get(1002));
	}
}
