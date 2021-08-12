package org.bardales.java.patrones.abstractfactory.producto;

import org.bardales.java.patrones.abstractfactory.PizzaProducto;

public class PizzaNewYorkVegetariana extends PizzaProducto {

    public PizzaNewYorkVegetariana() {
        this.setNombre("Pizza vegetariana New York");
        this.setMasa("Masa integral");
        this.setSalsa("Salsa de tomate");
        this.agregarIngrediente("Queso vegano").agregarIngrediente("Tomate")
                .agregarIngrediente("Aceitunas").agregarIngrediente("Espinacas")
                .agregarIngrediente("Berenjenas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25 min. a 150°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas cuadradas");
    }

}
