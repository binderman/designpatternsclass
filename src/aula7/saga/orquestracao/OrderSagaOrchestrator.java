package aula7.saga.orquestracao;

public class OrderSagaOrchestrator {
    private InventoryService inventoryService = new InventoryService();
    private PaymentService paymentService = new PaymentService();
    private ShippingService shippingService = new ShippingService();

    public void handleOrder(Order order) {
        try {
            if (!inventoryService.reserveInventory(order)) {
                throw new SagaExecutionException("Failed to reserve inventory");
            }

            if (!paymentService.chargePayment(order)) {
                inventoryService.rollbackInventory(order);
                throw new SagaExecutionException("Failed to process payment");
            }

            if (!shippingService.arrangeShipping(order)) {
                inventoryService.rollbackInventory(order);
                paymentService.rollbackPayment(order);
                throw new SagaExecutionException("Failed to arrange shipping");
            }

            System.out.println("Order processed successfully");
        } catch (SagaExecutionException e) {
            System.err.println(e.getMessage());
        }
    }
}