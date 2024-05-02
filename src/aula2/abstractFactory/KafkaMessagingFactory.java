package aula2.abstractFactory;

public class KafkaMessagingFactory implements MessagingFactory {
    public MessageService createMessageService() {
        return new KafkaMessageService();
    }
}


