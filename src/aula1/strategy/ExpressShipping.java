package aula1.strategy;
public class ExpressShipping implements ShippingStrategy {
    public double calculateShippingCost(Order order) {
        return order.getWeight() * 2.50;
    }
}
