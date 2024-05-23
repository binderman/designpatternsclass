package aula4.exercicios.solucao2;

import java.util.concurrent.BlockingQueue;

public abstract class DocumentProducer implements Runnable {
    protected BlockingQueue<Document> queue;

    public DocumentProducer(BlockingQueue<Document> queue) {
        this.queue = queue;
    }

    protected abstract Document createDocument();

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                Document document = createDocument();
                queue.put(document);
                System.out.println(getClass().getSimpleName() + " Produced: " + document.getId());
                Thread.sleep(getDelay());
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(getClass().getSimpleName() + " Producer thread interrupted.");
        }
    }

    protected abstract long getDelay();
}