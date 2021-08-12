package org.bardales.java.patrones.abstractfactory.producto;

import org.bardales.java.patrones.abstractfactory.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto {

    public PizzaCaliforniaQueso() {
        this.setNombre("Pizza California Queso");
        this.setMasa("Masa de la piedra delgada");
        this.setSalsa("Salsa de tomate rucula");
        this.agregarIngrediente("Extra queso Mozzarella").agregarIngrediente("Cebolla")
                .agregarIngrediente("Queso azul");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando a 35 min. a 100°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequenios triangulos");
    }

}
