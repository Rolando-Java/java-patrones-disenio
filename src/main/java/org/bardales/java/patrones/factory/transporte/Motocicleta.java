package org.bardales.java.patrones.factory.transporte;

public class Motocicleta implements Transportable {

    @Override
    public void arrancar() {
        System.out.println("Estoy arrancando la Motocicleta");
    }

    @Override
    public void detener() {
        System.out.println("Estoy deteniendo la Motocicleta");
    }

}
