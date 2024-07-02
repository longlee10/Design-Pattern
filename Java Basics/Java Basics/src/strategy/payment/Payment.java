package strategy.payment;

public class Payment {
    private PaymentStrategy paymentStrategy;
    private SecurityStrategy securityStrategy;

    public Payment(PaymentStrategy paymentStrategy, SecurityStrategy securityStrategy) {
        this.paymentStrategy = paymentStrategy;
        this.securityStrategy = securityStrategy;
    }

    public void pay(double amount){
        securityStrategy.secure();
        paymentStrategy.pay(amount);
    }
}
