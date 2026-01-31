package adityanathapplication;
import java.util.Scanner;
class ATM {
    static void withdraw(int balance, int amount) {
        if (amount > balance) {
            throw new ArithmeticException("Insufficient Balance");
        }
        balance = balance - amount;
        System.out.println("Withdrawal Successful");
        System.out.println("Remaining Balance: " + balance);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int amount = sc.nextInt();
        int balance = 5000;
        try {
            withdraw(balance, amount);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Transaction Finished");
        }
    }
}



