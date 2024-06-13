package aula7.transactionscript;

public class SimpleOrderService implements OrderService {
    @Override
    public void markAsComplete(Order order) {
        System.out.println("Pedido " + order.getId() + " completado com sucesso.");
    }
}
