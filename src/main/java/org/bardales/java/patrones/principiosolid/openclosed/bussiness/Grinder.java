package org.bardales.java.patrones.principiosolid.openclosed.bussiness;

import org.bardales.java.patrones.principiosolid.openclosed.domain.GroundCoffee;

public class Grinder {

    public GroundCoffee grind(GroundCoffee groundCoffee, int quantityCoffee) {
        System.out.println(
                "Grind the " + quantityCoffee + " coffee beans of " + groundCoffee.getName()
                        + " ...");
        return groundCoffee;
    }

}
