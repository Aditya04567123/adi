package adityanathapplication;

public class Test8 {
	static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Not eligible to vote");
		}
		System.out.println("Eligible to vote");
	}

	public static void main(String[] args) {
		  validate(16);

	}

}
