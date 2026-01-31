package com.smartbank.com;

public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(int accNo, String name, double balance, double interestRate) {
        super(accNo, name, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: ₹" + interest);
    }
}
