package org.bardales.java.patrones.abstractfactory.producto;

import org.bardales.java.patrones.abstractfactory.PizzaProducto;

public class PizzaCaliforniaPepperoni extends PizzaProducto {

    public PizzaCaliforniaPepperoni() {
        this.setNombre("Pizza California");
        this.setMasa("Masa a la piedra gruesa");
        this.setSalsa("Extra queso mozzarella");
        this.agregarIngrediente("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando a 50 min. a 55°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequenios rectangulos");
    }

}
