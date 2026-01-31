package com.smartbank.com;

import java.util.HashMap;
public class Bank {
    private HashMap<Integer, BankAccount> accounts = new HashMap<>();
    public void createAccount(BankAccount account) {
        accounts.put(account.getAccountNumber(), account);
        System.out.println("Account created successfully!");
    }
    public BankAccount getAccount(int accNo) {
        return accounts.get(accNo);
    }
}