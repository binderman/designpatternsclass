package aula7.saga.coreografia;

public interface EventConsumer {
    void accept(Event event);
}