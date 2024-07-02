package strategy.payment;

public class CreditPayment implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " using credit...");
    }
}
