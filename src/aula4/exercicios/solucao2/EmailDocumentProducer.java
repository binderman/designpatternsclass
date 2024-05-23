package aula4.exercicios.solucao2;

import java.util.Date;
import java.util.concurrent.BlockingQueue;

public class EmailDocumentProducer extends DocumentProducer {

    public EmailDocumentProducer(BlockingQueue<Document> queue) {
        super(queue);
    }

    @Override
    protected Document createDocument() {
        return new Document("Email", new Date(), "Email Content");
    }

    @Override
    protected long getDelay() {
        return 150;
    }
}
