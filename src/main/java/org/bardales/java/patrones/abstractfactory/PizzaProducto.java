package org.bardales.java.patrones.abstractfactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class PizzaProducto {

    private String nombre;
    private String masa;
    private String salsa;
    private List<String> ingredientes;

    protected PizzaProducto() {
        this.ingredientes = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMasa() {
        return this.masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getSalsa() {
        return this.salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public PizzaProducto agregarIngrediente(String ingrediente) {
        this.ingredientes.add(ingrediente);
        return this;
    }

    public void preparar() {
        System.out.println("Preparando " + this.nombre);
        System.out.println("Seleccionando la masa " + masa);
        System.out.println("Agregando ingredientes: ");
        this.ingredientes.forEach(System.out::println);
    }

    public void empaquetar() {
        System.out.println("Poniendo la pizza en una caja de empaque...");
    }

    protected abstract void cocinar();

    protected abstract void cortar();

    @Override
    public String toString() {
        return new StringBuilder().append("Nombre: ").append(this.nombre).append("\n")
                .append("Masa: ").append(this.masa).append("\n")
                .append("Salsa: ").append(this.salsa).append("\n")
                .append("Ingredientes: ").append(this.ingredientes.stream().sorted().reduce((a, b) -> a.concat(", ").concat(b)).orElse("")).toString();
    }

}
