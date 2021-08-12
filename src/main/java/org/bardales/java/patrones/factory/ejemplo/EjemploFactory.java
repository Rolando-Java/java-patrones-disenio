package org.bardales.java.patrones.factory.ejemplo;

import org.bardales.java.patrones.factory.Notification;
import org.bardales.java.patrones.factory.NotificationFactory;

import static org.bardales.java.patrones.factory.Constantes.TipoNotification.*;
public class EjemploFactory {

    public static void main(String... args) {

        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.crearNotification(EMAIL);
        notification.notifyUser();

    }

}
