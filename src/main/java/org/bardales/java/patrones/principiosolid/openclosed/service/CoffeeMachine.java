package org.bardales.java.patrones.principiosolid.openclosed.service;

import org.bardales.java.patrones.principiosolid.openclosed.domain.CoffeeDrink;
import org.bardales.java.patrones.principiosolid.openclosed.enums.CoffeeSelection;
import org.bardales.java.patrones.principiosolid.openclosed.exceptions.CoffeeException;

public interface CoffeeMachine {

    CoffeeDrink brewCoffee(CoffeeSelection selection) throws CoffeeException;

}
