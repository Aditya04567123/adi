package adityanathapplication;
public class Signatures {
	 public static   void main(String[] args) {
		System.out.println("hello");
		main();
	}
	 public static void main(int[] args) {
		 System.out.println("main accepting integer type array");
	 }
	 public static void main() {
		 System.out.println("main accepting any argument");
	 }
	 public static void main(char a) {
		 System.out.println("main is accepting character input");
	 }
}