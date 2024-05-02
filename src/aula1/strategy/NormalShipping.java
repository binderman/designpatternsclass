package aula1.strategy;
public class NormalShipping implements ShippingStrategy {
    public double calculateShippingCost(Order order) {
        return order.getWeight() * 1.25;
    }
}