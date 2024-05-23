package aula4.exercicios.solucao2;

import java.util.Date;
import java.util.concurrent.BlockingQueue;

public class ExternalSystemDocumentProducer extends DocumentProducer {

    public ExternalSystemDocumentProducer(BlockingQueue<Document> queue) {
        super(queue);
    }

    @Override
    protected Document createDocument() {
        return new Document("External", new Date(), "External System Content");
    }

    @Override
    protected long getDelay() {
        return 200;
    }
}
