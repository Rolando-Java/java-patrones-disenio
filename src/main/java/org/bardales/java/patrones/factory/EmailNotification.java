package org.bardales.java.patrones.factory;

public class EmailNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Enviando una notificacion e-mail");
    }

}
