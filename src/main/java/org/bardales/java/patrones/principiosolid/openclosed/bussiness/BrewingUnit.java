package org.bardales.java.patrones.principiosolid.openclosed.bussiness;

import org.bardales.java.patrones.principiosolid.openclosed.domain.CoffeeDrink;
import org.bardales.java.patrones.principiosolid.openclosed.domain.GroundCoffee;
import org.bardales.java.patrones.principiosolid.openclosed.enums.CoffeeSelection;

public class BrewingUnit {

    public CoffeeDrink brew(CoffeeSelection sel, GroundCoffee groundCoffee, int quantityWater) {
        System.out.println("Prepare coffee...");
        System.out.println("Type of coffee preparation : " + groundCoffee.getName());
        System.out.println("quantity water : " + quantityWater);
        return new CoffeeDrink();
    }

}
