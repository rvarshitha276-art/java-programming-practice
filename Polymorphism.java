class Notification {
    void send() {
        System.out.println("Sending a general notification.");
    }
}

class EmailNotification extends Notification {
    @Override
    void send() {
        System.out.println("Sending an email notification.");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Notification notification = new EmailNotification();
        notification.send();
    }
}
