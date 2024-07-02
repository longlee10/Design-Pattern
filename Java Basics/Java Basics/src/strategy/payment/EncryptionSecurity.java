package strategy.payment;

public class EncryptionSecurity implements SecurityStrategy{
    @Override
    public void secure() {
        System.out.println("Applying encryption...");
    }
}
