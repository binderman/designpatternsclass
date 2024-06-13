package aula7.saga.coreografia;

public class InventoryService implements EventConsumer {
    public void reserveInventory(Order order) {
        System.out.println("Reservando estoque para o pedido " + order.getId());
        EventBus.emit(new Event("InventoryReserved", order));
    }

    public void rollbackInventory(Order order) {
        System.out.println("Revertendo o estoque para o pedido " + order.getId());
    }

    @Override
    public void accept(Event event) {
        if ("OrderPlaced".equals(event.getType())) {
            reserveInventory(event.getOrder());
        }
    }
}


