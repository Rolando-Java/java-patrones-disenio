package org.bardales.java.patrones.principiosolid.singleresponsability;

import java.util.List;

public class Recomendador {

    public List<Pelicula> recomendaciones(final Cliente cliente) {
        return BBDD.PELIS_POR_DIRECTOR.entrySet().stream()
                .flatMap(es -> es.getValue().stream())
                .filter(p -> !cliente.getFavoritas().contains(p)).toList();
    }

}
