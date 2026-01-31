package adityanathapplication;
interface Payment1 {
    void pay(double amount);
}
abstract class OnlinePayment implements Payment1 {
    public void generateReceipt() {
        System.out.println("Receipt generated successfully");
    }
}

class CreditCardPayment extends OnlinePayment {
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " done using Credit Card");
    }
}

class UPIPayment extends OnlinePayment {
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " done using UPI");
    }
}

public class PaymentApp {
    public static void main(String[] args) {
        OnlinePayment upiPayment = new UPIPayment();
        upiPayment.pay(2000);
        upiPayment.generateReceipt();
    }
}

