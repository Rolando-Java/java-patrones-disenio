package org.bardales.java.patrones.principiosolid.liskobsubstitution.bussiness;

import org.bardales.java.patrones.principiosolid.liskobsubstitution.domain.CoffeeDrink;
import org.bardales.java.patrones.principiosolid.liskobsubstitution.domain.GroundCoffee;
import org.bardales.java.patrones.principiosolid.liskobsubstitution.enums.CoffeeSelection;

public class BrewingUnit {

    public CoffeeDrink brew(CoffeeSelection selection, GroundCoffee groundCoffee, double quantity) {
        return new CoffeeDrink(selection, groundCoffee.getQuantity());
    }

}
