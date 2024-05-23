package aula4.exercicios.solucao1;

import java.util.concurrent.BlockingQueue;

public class DocumentConsumer implements Runnable {
    private BlockingQueue<Document> queue;

    public DocumentConsumer(BlockingQueue<Document> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            while (true) {
                Document document = queue.take();
                processDocument(document);
                System.out.println("Processed: " + document.getId());
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void processDocument(Document document) throws InterruptedException {
        System.out.println("Processing document " + document.getId());
        Thread.sleep(500);
    }
}
