package org.bardales.java.patrones.principiosolid.dependencyinversion.bussiness;

import org.bardales.java.patrones.principiosolid.dependencyinversion.domain.CoffeeBean;
import org.bardales.java.patrones.principiosolid.dependencyinversion.domain.GroundCoffee;

public class Grinder {

    public GroundCoffee grind(CoffeeBean coffeeBean, double quantityCoffee) {
        return new GroundCoffee(coffeeBean.getName(), quantityCoffee);
    }

}
