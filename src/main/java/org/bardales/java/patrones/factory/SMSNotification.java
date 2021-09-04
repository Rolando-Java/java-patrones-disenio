package org.bardales.java.patrones.factory;

public class SMSNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Enviando una notificacion SMS");
    }

}
