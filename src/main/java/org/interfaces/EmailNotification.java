package org.interfaces;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Its an Email Notification!!!");
    }
}
