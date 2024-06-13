package aula7.saga.coreografia;

public class ShippingService implements EventConsumer {
    public void arrangeShipping(Order order) {
        System.out.println("Organizando o envio para o pedido " + order.getId());
        EventBus.emit(new Event("OrderShipped", order));
    }

    public void rollbackShipping(Order order) {
        System.out.println("Revertendo o envio para o pedido " + order.getId());
    }

    @Override
    public void accept(Event event) {
        if ("PaymentProcessed".equals(event.getType())) {
            arrangeShipping(event.getOrder());
        }
    }
}