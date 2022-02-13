package org.bardales.java.patrones.principiosolid.singleresponsability;

import java.util.List;
import java.util.stream.Collectors;

public class Exportador {

    public String formatoCSV(List<Pelicula> peliculas) {
        return peliculas.stream()
                .map(p -> p.getTitulo().concat(" - ").concat(p.getDirector()).concat(" - ")
                        .concat(p.getGenero())).collect(
                        Collectors.joining("\n"));
    }

}
