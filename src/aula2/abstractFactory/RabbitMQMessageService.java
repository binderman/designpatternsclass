package aula2.abstractFactory;

public class RabbitMQMessageService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Sending RabbitMQ message: " + message);
    }
}
