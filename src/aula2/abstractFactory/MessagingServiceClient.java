package aula2.abstractFactory;

public class MessagingServiceClient {
    private MessagingFactory factory;

    public MessagingServiceClient(MessagingFactory factory) {
        this.factory = factory;
    }

    public void send(String message) {
        MessageService service = factory.createMessageService();
        service.sendMessage(message);
    }
}

