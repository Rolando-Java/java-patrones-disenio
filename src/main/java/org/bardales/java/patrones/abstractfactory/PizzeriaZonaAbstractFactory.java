package org.bardales.java.patrones.abstractfactory;

public abstract class PizzeriaZonaAbstractFactory {

    protected PizzeriaZonaAbstractFactory(){

    }

    public PizzaProducto ordenarPizza(Constantes.TipoPizza tipoPizza) {
        PizzaProducto pizza = this.crearPizza(tipoPizza);
        System.out.println("-----Fabricando la pizza " + pizza.getNombre() + "-----");
        pizza.preparar();
        pizza.cocinar();
        pizza.cortar();
        pizza.empaquetar();
        return pizza;
    }

    abstract PizzaProducto crearPizza(Constantes.TipoPizza tipoPizza);

}
