package chainOfResponsibility;

public class Authenticator extends Handler {
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    boolean doHandle(HttpRequest request) {
        System.out.println("Authenticating...");
        return !(request.getUsername() == "admin" && request.getPassword() == "1234");
    }
}
