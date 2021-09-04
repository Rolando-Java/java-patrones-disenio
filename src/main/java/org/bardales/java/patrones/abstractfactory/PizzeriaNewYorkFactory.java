package org.bardales.java.patrones.abstractfactory;

import org.bardales.java.patrones.abstractfactory.producto.PizzaNewYorkItaliana;
import org.bardales.java.patrones.abstractfactory.producto.PizzaNewYorkPepperoni;
import org.bardales.java.patrones.abstractfactory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory {

    @Override
    PizzaProducto crearPizza(Constantes.TipoPizza tipoPizza) {
        return switch (tipoPizza) {
            case VEGETARIANA -> new PizzaNewYorkVegetariana();
            case PEPPERONI -> new PizzaNewYorkPepperoni();
            case ITALIANA -> new PizzaNewYorkItaliana();
            default -> null;
        };
    }

}
