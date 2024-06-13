package transactionscript;

import java.util.Map;

public class Order {
    private String id;
    private Map<Item, Integer> items;
    private double total;

    public Order(String id, Map<Item, Integer> items, double total) {
        this.id = id;
        this.items = items;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public Map<Item, Integer> getItems() {
        return items;
    }

    public double getTotal() {
        return total;
    }
}