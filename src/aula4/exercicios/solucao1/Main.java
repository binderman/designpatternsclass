package aula4.exercicios.solucao1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<Document> queue = new ArrayBlockingQueue<>(10);

        DocumentProducer producer = new DocumentProducer(queue);
        DocumentConsumer consumer = new DocumentConsumer(queue);

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}