package aula2.factoryMethod.sem;

// Define uma interface comum para todos os serviços.
interface MessageService {
    void sendMessage(String message);
}

// Implementação de um serviço de e-mail.
class EmailService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Email: " + message);
    }
}

// Implementação de um serviço de SMS.
class SMSService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("SMS: " + message);
    }
}

// Implementação de um serviço de notificação push.
class PushNotificationService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Push Notification: " + message);
    }
}


public class NotificationManager {
    public void sendNotification(String type, String message) {
        MessageService service;
        switch (type) {
            case "email":
                service = new EmailService();
                break;
            case "sms":
                service = new SMSService();
                break;
            case "push":
                service = new PushNotificationService();
                break;
            default:
                throw new IllegalArgumentException("Unknown service type: " + type);
        }
        service.sendMessage(message);
    }

    public static void main(String[] args) {
        NotificationManager manager = new NotificationManager();
        manager.sendNotification("email", "Hello, this is an email!");
        manager.sendNotification("sms", "Hello, this is a SMS!");
    }
}

