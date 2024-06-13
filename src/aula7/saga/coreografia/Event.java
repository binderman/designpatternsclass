package aula7.saga.coreografia;

public class Event {
    private String type;
    private Order order;

    public Event(String type, Order order) {
        this.type = type;
        this.order = order;
    }

    public String getType() {
        return type;
    }

    public Order getOrder() {
        return order;
    }
}

