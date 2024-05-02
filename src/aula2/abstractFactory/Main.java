package aula2.abstractFactory;

public class Main {
    public static void main(String[] args) {
        MessagingFactory messagingFactory = new KafkaMessagingFactory();
        MessageService messageService = messagingFactory.createMessageService();
        messageService.sendMessage("Hello, Kafka!");

        messagingFactory = new RabbitMQMessagingFactory();
        messageService = messagingFactory.createMessageService();
        messageService.sendMessage("Hello, RabbitMQ!");
    }   
}
