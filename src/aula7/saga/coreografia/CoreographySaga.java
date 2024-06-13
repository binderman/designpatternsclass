package aula7.saga.coreografia;

public class CoreographySaga {
    public static void setupServices() {
        InventoryService inventoryService = new InventoryService();
        PaymentService paymentService = new PaymentService();
        ShippingService shippingService = new ShippingService();

        EventBus.registerConsumer(inventoryService);
        EventBus.registerConsumer(paymentService);
        EventBus.registerConsumer(shippingService);
    }

    public static void main(String[] args) {
        setupServices();
        Order newOrder = new Order("12345");
        EventBus.emit(new Event("OrderPlaced", newOrder));
    }
}
