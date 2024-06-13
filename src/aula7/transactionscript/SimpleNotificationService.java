package transactionscript;

public class SimpleNotificationService implements NotificationService {
    @Override
    public void sendOrderConfirmation(Order order) {
        System.out.println("Enviando confirmação para pedido " + order.getId());
    }
}
