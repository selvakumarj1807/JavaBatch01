interface payment{
    void pay(double amount);

    void refund(double amount);
}

class GooglePay implements payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Google Pay.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded " + amount + " using Google Pay.");
    }
}

class PayPal implements payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded " + amount + " using PayPal.");
    }
}

public class interface10 {
    public static void main(String[] args) {
        payment googlePay = new GooglePay();
        googlePay.pay(100.0);
        googlePay.refund(50.0);

        payment payPal = new PayPal();
        payPal.pay(100.0);
        payPal.refund(50.0);
    }
}
