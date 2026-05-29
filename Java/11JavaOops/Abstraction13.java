abstract class Payment {
    abstract void pay(double amount);

    void paymentStatus() {
        System.out.println("Payment processed successfully.");
    }
}

class CreditCardPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class PayPalPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

public class Abstraction13 {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        payment1.pay(100.0);
        payment1.paymentStatus();

        Payment payment2 = new PayPalPayment();
        payment2.pay(50.0);
        payment2.paymentStatus();
    }
}