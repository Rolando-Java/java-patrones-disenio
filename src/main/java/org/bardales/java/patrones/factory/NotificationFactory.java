package org.bardales.java.patrones.factory;

public class NotificationFactory {

    public Notification crearNotification(Constantes.TipoNotification tipoNotification) {
        return switch(tipoNotification) {
            case SMS -> new SMSNotification();
            case EMAIL -> new EmailNotification();
            case PUSH -> new PushNotification();
            default -> null;
        };
    }

}
