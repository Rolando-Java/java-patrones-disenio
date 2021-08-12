package org.bardales.java.patrones.abstractfactory.producto;

import org.bardales.java.patrones.abstractfactory.PizzaProducto;

public class PizzaCaliforniaVegetariana extends PizzaProducto {

    public PizzaCaliforniaVegetariana() {
        this.setNombre("Pizza California Vegetariana");
        this.setMasa("Masa delgada Light");
        this.setSalsa("Salsa BBQ Light");
        this.agregarIngrediente("Queso Mozzarella").agregarIngrediente("Aceitunas")
                .agregarIngrediente("Espinacas").agregarIngrediente("Cebolla")
                .agregarIngrediente("Berenjena");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 20 min. a 180°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas rectangulares");
    }

}
