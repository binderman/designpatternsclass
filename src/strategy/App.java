package strategy;

public class App {
    public static void main(String[] args) throws Exception {
        Order order = new Order(10, new Sedex10Shipping());
        System.out.println(order.calculateShipping());
    }
}
