package org.bardales.java.patrones.principiosolid.dependencyinversion.service;

import org.bardales.java.patrones.principiosolid.dependencyinversion.domain.CoffeeDrink;
import org.bardales.java.patrones.principiosolid.dependencyinversion.enums.CoffeeSelection;
import org.bardales.java.patrones.principiosolid.dependencyinversion.exceptions.CoffeeException;

public interface EspressoCoffeeMachine extends CoffeeMachine {

    CoffeeDrink brewEspresso(CoffeeSelection selection) throws CoffeeException;

}
