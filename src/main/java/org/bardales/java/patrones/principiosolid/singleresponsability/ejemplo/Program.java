package org.bardales.java.patrones.principiosolid.singleresponsability.ejemplo;

import java.util.List;
import org.bardales.java.patrones.principiosolid.singleresponsability.BBDD;
import org.bardales.java.patrones.principiosolid.singleresponsability.Exportador;
import org.bardales.java.patrones.principiosolid.singleresponsability.Pelicula;
import org.bardales.java.patrones.principiosolid.singleresponsability.Recomendador;

public class Program {

    public static void main(String... args) {

       /*
        Single Responsability : una clase debe tener una, y solo una razón para cambiar.
        Es decir, una clase debe contener métodos cuyas funcionalidades van relacionadas,
        de esta forma, la clase tiene una responsabilidad única.
       */

        Recomendador recomendador = new Recomendador();
        Exportador exportador = new Exportador();

        List<Pelicula> peliculas = recomendador.recomendaciones(BBDD.JUAN);
        System.out.println("peliculas = " + peliculas);

        String data = exportador.formatoCSV(peliculas);
        System.out.println("data = " + data);

    }

}
