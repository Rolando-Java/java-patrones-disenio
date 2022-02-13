package org.bardales.java.patrones.principiosolid.singleresponsability;

import java.util.Objects;

public class Pelicula {

    private String titulo;
    private String genero;
    private String director;

    public Pelicula(String titulo, String genero, String director) {
        this.titulo = titulo;
        this.genero = genero;
        this.director = director;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getGenero() {
        return this.genero;
    }

    public String getDirector() {
        return this.director;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        return o instanceof final Pelicula pelicula && Objects.equals(this.director,
                pelicula.director) && Objects.equals(this.genero, pelicula.genero)
                && Objects.equals(this.titulo, pelicula.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.director, this.genero, this.titulo);
    }

    @Override
    public String toString() {
        return String.format("Titulo: %1$s , Genero: %2$s , Director: %3$s", this.titulo,
                this.genero, this.director);
    }

}
