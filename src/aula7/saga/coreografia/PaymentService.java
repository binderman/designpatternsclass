package aula7.saga.coreografia;

public class PaymentService implements EventConsumer {
    public void chargePayment(Order order) {
        System.out.println("Cobrando o pagamento para o pedido " + order.getId());
        EventBus.emit(new Event("PaymentProcessed", order));
    }

    public void rollbackPayment(Order order) {
        System.out.println("Revertendo pagamento para o pedido " + order.getId());
    }

    @Override
    public void accept(Event event) {
        if ("InventoryReserved".equals(event.getType())) {
            chargePayment(event.getOrder());
        }
    }
}


