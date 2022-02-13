package org.bardales.java.patrones.principiosolid.dependencyinversion.bussiness;

import org.bardales.java.patrones.principiosolid.dependencyinversion.domain.CoffeeDrink;
import org.bardales.java.patrones.principiosolid.dependencyinversion.domain.GroundCoffee;
import org.bardales.java.patrones.principiosolid.dependencyinversion.enums.CoffeeSelection;

public class BrewingUnit {

    public CoffeeDrink brew(CoffeeSelection selection, GroundCoffee groundCoffee, double quantity) {
        return new CoffeeDrink(selection, groundCoffee.getQuantity());
    }

}
