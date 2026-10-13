package org.interfaces;

public class NotificationMain {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification sms = new SmsNotification();
        email.notifyUser();
        sms.notifyUser();
    }
}
