package org.bardales.java.patrones.principiosolid.singleresponsability;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BBDD {

    private static final String GENERO_FANTASTICO = "fantastica";
    private static final String GENERO_BELICO = "belico";
    private static final String DIRECTOR_SPIELBERG = "Spielberg";
    private static final Pelicula ET = new Pelicula("ET", GENERO_FANTASTICO, DIRECTOR_SPIELBERG);
    public static final Cliente JUAN = new Cliente("juan", ET);
    private static final Pelicula SOLADO_RYAN = new Pelicula("Salvando al soldado ryan",
            GENERO_BELICO, DIRECTOR_SPIELBERG);
    public static final Map<String, List<Pelicula>> PELIS_POR_DIRECTOR = Stream.of(ET, SOLADO_RYAN)
            .collect(Collectors.groupingBy(Pelicula::getDirector));


}
