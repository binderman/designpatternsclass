package transactionscript;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new SimplePaymentService();
        InventoryService inventoryService = new SimpleInventoryService();
        OrderService orderService = new SimpleOrderService();
        NotificationService notificationService = new SimpleNotificationService();

        Map<Item, Integer> items = new HashMap<>();
        items.put(new Item("Livro", 29.99), 2);
        items.put(new Item("Caneta", 1.49), 10);

        Order order = new Order("1234", items, 69.96);

        try {
            processOrder(order, paymentService, inventoryService, orderService, notificationService);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void processOrder(Order order, PaymentService paymentService, InventoryService inventoryService,
                                    OrderService orderService, NotificationService notificationService) throws PaymentException {
        if (paymentService.charge(order.getTotal())) {
            inventoryService.decreaseStock(order.getItems());
            orderService.markAsComplete(order);
            notificationService.sendOrderConfirmation(order);
            System.out.println("Pedido processad com sucesso.");
        } else {
            throw new PaymentException("Pagamento falhou.");
        }
    }
}
