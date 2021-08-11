package org.bardales.java.patrones.factory;

import org.bardales.java.patrones.factory.transporte.Transportable;
import org.bardales.java.patrones.factory.utilitario.TipoTransporte;

import java.time.Duration;
import java.time.Instant;

public class EjemploFactory {

    public static void main(String... args) {

        Transportable transporte = Factory.construir(TipoTransporte.MOTOCICLETA);
        transporte.arrancar();
        transporte.detener();

    }

}
