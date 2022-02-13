package org.bardales.java.patrones.principiosolid.dependencyinversion.service;

import org.bardales.java.patrones.principiosolid.dependencyinversion.domain.CoffeeDrink;
import org.bardales.java.patrones.principiosolid.dependencyinversion.enums.CoffeeSelection;
import org.bardales.java.patrones.principiosolid.dependencyinversion.exceptions.CoffeeException;

public interface CoffeeMachine {

    CoffeeDrink brewCoffee(CoffeeSelection selection) throws CoffeeException;

}
