package aula3.facade;

public class BookingFacade {
    private BookingSystem bookingSystem;
    private PaymentSystem paymentSystem;
    private NotificationSystem notificationSystem;

    public BookingFacade() {
        this.bookingSystem = new BookingSystem();
        this.paymentSystem = new PaymentSystem();
        this.notificationSystem = new NotificationSystem();
    }

    public void bookRoom(String date, 
                         int nights, 
                         String roomType, 
                         String paymentDetails, 
                         String email) {
        if (bookingSystem.bookRoom(date, nights, roomType)) {
            if (paymentSystem.processPayment(paymentDetails)) {
                notificationSystem.sendConfirmationEmail(email, 
                    "Your room has been booked successfully!");
            }
        }
    }
}

