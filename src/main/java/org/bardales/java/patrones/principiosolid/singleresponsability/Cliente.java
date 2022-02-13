package org.bardales.java.patrones.principiosolid.singleresponsability;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Cliente {

    private String nombre;
    private List<Pelicula> favoritas;

    public Cliente(String nombre, Pelicula... favoritas) {
        this.nombre = nombre;
        this.favoritas = Arrays.asList(favoritas);
    }

    public String getNombre() {
        return this.nombre;
    }

    public List<Pelicula> getFavoritas() {
        return this.favoritas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        return o instanceof final Cliente cliente && Objects.equals(this.nombre, cliente.nombre)
                && Objects.equals(this.favoritas, cliente.favoritas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.nombre, this.favoritas);
    }

    @Override
    public String toString() {
        return String.format("Nombre : %1$s , Favoritos : %2$s", this.nombre, this.favoritas);
    }

}
