package aula4.exercicios.solucao2;

import java.util.Date;
import java.util.concurrent.BlockingQueue;

public class UploadDocumentProducer extends DocumentProducer {

    public UploadDocumentProducer(BlockingQueue<Document> queue) {
        super(queue);
    }

    @Override
    protected Document createDocument() {
        return new Document("Upload", new Date(), "Uploaded Content");
    }

    @Override
    protected long getDelay() {
        return 100;
    }
}
