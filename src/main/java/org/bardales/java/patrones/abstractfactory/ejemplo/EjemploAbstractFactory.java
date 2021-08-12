package org.bardales.java.patrones.abstractfactory.ejemplo;

import org.bardales.java.patrones.abstractfactory.PizzaProducto;
import org.bardales.java.patrones.abstractfactory.PizzeriaCaliforniaFactory;
import org.bardales.java.patrones.abstractfactory.PizzeriaNewYorkFactory;
import org.bardales.java.patrones.abstractfactory.PizzeriaZonaAbstractFactory;

import static org.bardales.java.patrones.abstractfactory.Constantes.TipoPizza.*;

public class EjemploAbstractFactory {

    public static void main(String... args) {
        PizzeriaZonaAbstractFactory pizzeriaNewYork = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory pizzeriaCalifornia = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = pizzeriaCalifornia.ordenarPizza(QUESO);
        System.out.println("Bruce ordena la pizza " + pizza.getNombre());

        pizza = pizzeriaNewYork.ordenarPizza(PEPPERONI);
        System.out.println("Andre ordena una " + pizza.getNombre());

        pizza = pizzeriaCalifornia.ordenarPizza(VEGETARIANA);
        System.out.println("James ordena " + pizza.getNombre());

        pizza = pizzeriaNewYork.ordenarPizza(VEGETARIANA);
        System.out.println("Linus ordena la pizza " + pizza.getNombre());

        pizza = pizzeriaCalifornia.ordenarPizza(PEPPERONI);
        System.out.println("John ordena la pizza " + pizza.getNombre());

        System.out.println(pizza);

    }

}
