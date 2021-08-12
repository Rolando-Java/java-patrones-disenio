package org.bardales.java.patrones.abstractfactory.producto;

import org.bardales.java.patrones.abstractfactory.PizzaProducto;

public class PizzaNewYorkPepperoni extends PizzaProducto {

    public PizzaNewYorkPepperoni() {
        this.setNombre("Pizza Pepperoni New York");
        this.setMasa("Masa delgada a la piedra");
        this.setSalsa("Salsa de tomate");
        this.agregarIngrediente("Queso mozzarella").agregarIngrediente("Extra pepperoni")
                .agregarIngrediente("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 40 min. a 90°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangulos");
    }

}
