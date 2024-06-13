package aula7.saga.orquestracao;

public class InventoryService {
    public boolean reserveInventory(Order order) {
        System.out.println("Reserving inventory for order " + order.getId());
        return true; // Simula reserva bem-sucedida
    }

    public void rollbackInventory(Order order) {
        System.out.println("Rolling back inventory for order " + order.getId());
    }
}


