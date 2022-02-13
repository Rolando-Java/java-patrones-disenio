package org.bardales.java.patrones.principiosolid.interfacesegregation.bussiness;

import org.bardales.java.patrones.principiosolid.interfacesegregation.domain.CoffeeBean;
import org.bardales.java.patrones.principiosolid.interfacesegregation.domain.GroundCoffee;

public class Grinder {

    public GroundCoffee grind(CoffeeBean coffeeBean, double quantityCoffee) {
        return new GroundCoffee(coffeeBean.getName(), quantityCoffee);
    }

}
