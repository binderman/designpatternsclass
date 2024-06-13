package aula7.saga.coreografia;

import java.util.ArrayList;
import java.util.List;

// Definição básica de um EventBus simplificado
public class EventBus {
    private static final List<EventConsumer> consumers = new ArrayList<>();

    public static void registerConsumer(EventConsumer consumer) {
        consumers.add(consumer);
    }

    public static void emit(Event event) {
        consumers.forEach(consumer -> consumer.accept(event));
    }
}
