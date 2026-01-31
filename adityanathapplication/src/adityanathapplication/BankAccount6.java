package adityanathapplication;
class BankAccount5
{
 private int balance = 1000;
 public synchronized void deposit(int amount) {
     balance += amount;
     System.out.println(Thread.currentThread().getName()
             + "deposited:"+amount+"Balance:"+balance);
 }
 public synchronized void withdraw(int amount) {
     if (balance >= amount) {
         balance -= amount;
         System.out.println(Thread.currentThread().getName()
                 + "withdraw:"+amount+"Balance:"+balance);
     } else {
         System.out.println(Thread.currentThread().getName()
                 + " insufficient balance");
     }
 }
}
class BankUser extends Thread {
 BankAccount5 account;

 BankUser(BankAccount5 account, String name) {
     super(name);
     this.account = account;
 }
 public void run() {
     account.deposit(500);
     account.withdraw(700);
 }
}
public class BankAccount6{
 public static void main(String[] args) {
     BankAccount5 account = new BankAccount5();
     BankUser u1 = new BankUser(account,"User1");
     BankUser u2 = new BankUser(account,"User2");
     BankUser u3 = new BankUser(account,"User3");
     u1.start();
     u2.start();
     u3.start();
 }
}
