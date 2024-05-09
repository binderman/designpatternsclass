package aula3.facade;

public class NotificationSystem {
    public void sendConfirmationEmail(String email, String message) {
        System.out.println("Sending confirmation email to " + email);
        System.out.println("With message: " + message);
    }
}
