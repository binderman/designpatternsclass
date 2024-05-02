package aula1.strategy;
public class Sedex10Shipping implements ShippingStrategy {
    public double calculateShippingCost(Order order) {
        return order.getWeight() * 5.00;
    }
}
