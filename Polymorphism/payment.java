interface PaymentProcessor {
    void pay(double amount);
}
class CardPayment implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid by card");
    }
}

class UpiPayment implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid by UPI");
    }
}