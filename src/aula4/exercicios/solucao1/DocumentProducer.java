package aula4.exercicios.solucao1;

import java.util.Date;
import java.util.concurrent.BlockingQueue;

public class DocumentProducer implements Runnable {
    private BlockingQueue<Document> queue;

    public DocumentProducer(BlockingQueue<Document> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            while (true) {
                Document document = new Document("Doc" + System.currentTimeMillis(), new Date(), "Content");
                queue.put(document);
                System.out.println("Produced: " + document.getId());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
