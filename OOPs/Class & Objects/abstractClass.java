abstract class Notification {
    protected String recipient;

    public Notification(String recipient) {
        this.recipient = recipient;
    }

    public void showRecipient() {
        System.out.println(recipient);
    }

    public abstract void send();
}
class EmailNotification extends Notification {
    public EmailNotification(String recipient) {
        super(recipient);
    }

    @Override
    public void send() {
        System.out.println("Sending email to " + recipient);
    }
}