package org.bardales.java.patrones.factory.transporte;

public class Automovil implements Transportable {

    @Override
    public void arrancar() {
        System.out.println("Estoy arrancando el Automovil");
    }

    @Override
    public void detener() {
        System.out.println("Estoy deteniendo el Automovil");
    }

}
