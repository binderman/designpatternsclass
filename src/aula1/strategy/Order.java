public class Order {
    private double weight;
    private ShippingStrategy shippingStrategy;

    public Order(double weight, ShippingStrategy strategy) {
        this.weight = weight;
        this.shippingStrategy = strategy;
    }

    public void setShippingStrategy(ShippingStrategy strategy) {
        this.shippingStrategy = strategy;
    }

    public double calculateShipping() {
        return shippingStrategy.calculateShippingCost(this);
    }

    public double getWeight() {
        return weight;
    }
}


