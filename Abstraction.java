abstract class Payment {
    abstract void pay(double amount);
}

class UpiPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Processing UPI payment of Rs. " + amount);
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Payment payment = new UpiPayment();
        payment.pay(500.0);
    }
}
