package com.smartbank.com;
import java.util.Scanner;
public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        while (true) {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Account No: ");
                    int accNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double bal = sc.nextDouble();
                    BankAccount account =
                            new SavingsAccount(accNo, name, bal, 5);
                    bank.createAccount(account);
                    break;
                case 2:
                    System.out.print("Enter Account No: ");
                    accNo = sc.nextInt();
                    System.out.print("Enter Amount: ");
                    double dep = sc.nextDouble();
                    bank.getAccount(accNo).deposit(dep);
                    break;

                case 3:
                    System.out.print("Enter Account No: ");
                    accNo = sc.nextInt();
                    System.out.print("Enter Amount: ");
                    double wd = sc.nextDouble();
                    bank.getAccount(accNo).withdraw(wd);
                    break;
                case 4:
                    System.out.print("Enter Account No: ");
                    accNo = sc.nextInt();
                    bank.getAccount(accNo).displayDetails();
                    break;
                case 5:
                    System.out.println("Thank you for using Bank System!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

