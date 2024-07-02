package java;

// Abstraction: hiding implementation details from the outside of the class
public class MailService {
    public void sendEmail(){
        connect();
        authenticate();
        disconnect();
    }

    private void connect(){
        System.out.println("Connect...");
    }

    private void authenticate(){
        System.out.println("Authenticate...");
    }

    private void disconnect(){
        System.out.println("Disconnect...");
    }
}
