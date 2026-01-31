package adityanath;
class Payment {
 public void pay() {
     System.out.println("Payment processed through base method.");
 }
}
class CashPayment extends Payment {
 public void pay() {
     System.out.println("Payment made using cash.");
 }
}
class CardPayment extends Payment {
 public void pay() {
     System.out.println("Payment made using card.");
 }
}
public class PaymentDemo {
 public static void main(String[] args) {
     Payment payment1 = new CashPayment();
     Payment payment2 = new CardPayment();
     
     payment1.pay();  
     payment2.pay();  
 }
}

