package aula4.exercicios.solucao2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        // Criação de uma fila com capacidade para 50 documentos
        BlockingQueue<Document> queue = new ArrayBlockingQueue<>(50);

        // Instanciando produtores
        DocumentProducer emailProducer = new EmailDocumentProducer(queue);
        DocumentProducer uploadProducer = new UploadDocumentProducer(queue);
        DocumentProducer externalProducer = new ExternalSystemDocumentProducer(queue);

        // Iniciando threads de produtores
        new Thread(emailProducer, "EmailProducerThread").start();
        new Thread(uploadProducer, "UploadProducerThread").start();
        new Thread(externalProducer, "ExternalSystemProducerThread").start();

        // Consumidor de documentos
        DocumentConsumer consumer1 = new DocumentConsumer(queue, 1);
        DocumentConsumer consumer2 = new DocumentConsumer(queue, 2);
        new Thread(consumer1).start();
        new Thread(consumer2).start();
    }
}
