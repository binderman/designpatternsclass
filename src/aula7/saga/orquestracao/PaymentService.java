package aula7.saga.orquestracao;

public class PaymentService {
    public boolean chargePayment(Order order) {
        System.out.println("Charging payment for order " + order.getId());
        return true; // Simula pagamento bem-sucedido
    }

    public void rollbackPayment(Order order) {
        System.out.println("Rolling back payment for order " + order.getId());
    }
}


