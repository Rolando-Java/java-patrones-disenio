package org.bardales.java.patrones.principiosolid.liskobsubstitution.bussiness;

import org.bardales.java.patrones.principiosolid.liskobsubstitution.domain.CoffeeBean;
import org.bardales.java.patrones.principiosolid.liskobsubstitution.domain.GroundCoffee;

public class Grinder {

    public GroundCoffee grind(CoffeeBean coffeeBean, double quantityCoffee) {
        return new GroundCoffee(coffeeBean.getName(), quantityCoffee);
    }

}
