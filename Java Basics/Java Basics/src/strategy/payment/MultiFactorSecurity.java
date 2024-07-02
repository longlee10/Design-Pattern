package strategy.payment;

public class MultiFactorSecurity implements SecurityStrategy{
    @Override
    public void secure() {
        System.out.println("Applying multi-factor...");
    }
}
