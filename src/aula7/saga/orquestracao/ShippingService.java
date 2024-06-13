package aula7.saga.orquestracao;

public class ShippingService {
    public boolean arrangeShipping(Order order) {
        System.out.println("Arranging shipping for order " + order.getId());
        return true; // Simula organização de envio bem-sucedida
    }

    public void rollbackShipping(Order order) {
        System.out.println("Rolling back shipping for order " + order.getId());
    }
}
