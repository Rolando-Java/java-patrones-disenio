package org.bardales.java.patrones.principiosolid.interfacesegregation.bussiness;

import org.bardales.java.patrones.principiosolid.interfacesegregation.domain.CoffeeDrink;
import org.bardales.java.patrones.principiosolid.interfacesegregation.domain.GroundCoffee;
import org.bardales.java.patrones.principiosolid.interfacesegregation.enums.CoffeeSelection;

public class BrewingUnit {

    public CoffeeDrink brew(CoffeeSelection selection, GroundCoffee groundCoffee, double quantity) {
        return new CoffeeDrink(selection, groundCoffee.getQuantity());
    }

}
