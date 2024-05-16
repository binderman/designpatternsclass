package aula4.producerConsumer;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private final BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                queue.put(i);
                System.out.println("Produced " + i);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}

