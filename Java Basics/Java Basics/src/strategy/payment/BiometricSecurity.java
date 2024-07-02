package strategy.payment;

public class BiometricSecurity implements SecurityStrategy{
    @Override
    public void secure() {
        System.out.println("Applying biometric...");
    }
}
