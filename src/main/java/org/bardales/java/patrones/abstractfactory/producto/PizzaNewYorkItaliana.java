package org.bardales.java.patrones.abstractfactory.producto;

import org.bardales.java.patrones.abstractfactory.PizzaProducto;

public class PizzaNewYorkItaliana extends PizzaProducto {

    public PizzaNewYorkItaliana() {
        this.setNombre("Pizza Italiana New York");
        this.setMasa("Masa gruesa");
        this.agregarIngrediente("Queso Mozzarella").agregarIngrediente("Aceitunas")
                .agregarIngrediente("Jamon").agregarIngrediente("Choricillo")
                .agregarIngrediente("Champiniones");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 30 min a 120°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangulos grandes");
    }

}
