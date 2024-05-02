package aula2.abstractFactory;

public class RabbitMQMessagingFactory implements MessagingFactory {
    public MessageService createMessageService() {
        return new RabbitMQMessageService();
    }
}