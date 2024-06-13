package aula7.saga.orquestracao;

public class Main {
    public static void main(String[] args) {
        OrderSagaOrchestrator sagaOrchestrator = new OrderSagaOrchestrator();
        Order newOrder = new Order("12345");
        sagaOrchestrator.handleOrder(newOrder);
    }
}
