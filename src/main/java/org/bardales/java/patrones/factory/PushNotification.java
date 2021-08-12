package org.bardales.java.patrones.factory;

public class PushNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Enviando una notificacion push");
    }

}
