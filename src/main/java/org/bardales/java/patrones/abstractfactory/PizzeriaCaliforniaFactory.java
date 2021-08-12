package org.bardales.java.patrones.abstractfactory;

import org.bardales.java.patrones.abstractfactory.producto.PizzaCaliforniaPepperoni;
import org.bardales.java.patrones.abstractfactory.producto.PizzaCaliforniaQueso;
import org.bardales.java.patrones.abstractfactory.producto.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory {

    @Override
    PizzaProducto crearPizza(Constantes.TipoPizza tipoPizza) {
        return switch (tipoPizza) {
            case QUESO -> new PizzaCaliforniaQueso();
            case VEGETARIANA -> new PizzaCaliforniaVegetariana();
            case PEPPERONI -> new PizzaCaliforniaPepperoni();
            default -> null;
        };
    }

}
