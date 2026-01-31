package adityanathapplication;


class Payment {
    void pay() {
        System.out.println("Processing payment");
    }
}
class CashPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Payment made using Cash");
    }
}
class CardPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Payment made using Card");
    }
}
public class TestPayment {
    public static void main(String[] args) {

        Payment p;

        p = new CashPayment();  
        p.pay();

        p = new CardPayment(); 
        p.pay();
    }
}





