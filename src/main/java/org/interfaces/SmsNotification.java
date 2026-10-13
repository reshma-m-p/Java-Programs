package org.interfaces;

public class SmsNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Its a SMS Notification!!!");
    }
}
