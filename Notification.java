
public abstract class Notification {

    public abstract void send(String to, String msg);

    public String getType() {
        return this.getClass().getSimpleName();
    }
}

class EmailNotification extends Notification {

    @Override
    public void send(String to, String msg) {
        System.out.println("Sending an email notification to " + to + " with the message: " + msg);
    }
}

class SMSNotification extends Notification {

    @Override
    public void send(String to, String msg) {
        System.out.println("Sending an SMS notification to " + to + " with the message: " + msg);
    }
}

class PushNotification extends Notification {

    @Override
    public void send(String to, String msg) {
        System.out.println("Sending a push notification to " + to + " with the message: " + msg);
    }
}

class NotificationService {

    public void notifyUser(Notification notification, String to, String msg) {
        System.out.println("Preparing to send a " + notification.getType());
        notification.send(to, msg);
    }
}

class Execute {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        Notification email = new EmailNotification();
        service.notifyUser(email, "2307090@ycce.in", "Your order has shipped!");

        System.out.println("-------------------------");

        Notification sms = new SMSNotification();
        service.notifyUser(sms, "9975012450", "Your delivery is arriving soon.");

        System.out.println("-------------------------");

        Notification push = new PushNotification();
        service.notifyUser(push, "service", "New message.");
    }
}