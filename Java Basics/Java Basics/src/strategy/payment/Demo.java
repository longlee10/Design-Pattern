package strategy.payment;

public class Demo {
    public static void main(String[] args) {
        var payment = new Payment(new CreditPayment(), new BiometricSecurity());
        payment.pay(100);
    }
}
