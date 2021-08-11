package org.bardales.java.patrones.factory;

import org.bardales.java.patrones.factory.transporte.Automovil;
import org.bardales.java.patrones.factory.transporte.Motocicleta;
import org.bardales.java.patrones.factory.transporte.Transportable;
import org.bardales.java.patrones.factory.utilitario.TipoTransporte;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public class Factory {

    public static Transportable construir(TipoTransporte tipoTransporte) {

        tipoTransporte = Optional.ofNullable(tipoTransporte).orElse(TipoTransporte.AUTOMOVIL);

        switch (tipoTransporte) {
            case AUTOMOVIL -> {
                return new Automovil();
            }
            case MOTOCICLETA -> {
                return new Motocicleta();
            }
            default -> {
                throw new UnsupportedOperationException("La operacíon no esta contemplada");
            }
        }

    }

}
