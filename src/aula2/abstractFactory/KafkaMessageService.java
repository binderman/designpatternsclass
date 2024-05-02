package aula2.abstractFactory;

public class KafkaMessageService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Sending Kafka message: " + message);
    }
}

