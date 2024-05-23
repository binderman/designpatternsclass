package aula4.exercicios.solucao2;

import java.util.concurrent.BlockingQueue;

public class DocumentConsumer implements Runnable {
    private BlockingQueue<Document> queue;
    private int id;

    public DocumentConsumer(BlockingQueue<Document> queue, int id) {
        this.queue = queue;
        this.id = id;
    }

    public void run() {
        try {
            while (true) {
                Document document = queue.take();
                processDocument(document);
                System.out.println("Consumer " + this.id + " processed: " + document.getId());
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void processDocument(Document document) throws InterruptedException {
        // System.out.println("Processing document " + document.getId());
        Thread.sleep(500);
    }
}
