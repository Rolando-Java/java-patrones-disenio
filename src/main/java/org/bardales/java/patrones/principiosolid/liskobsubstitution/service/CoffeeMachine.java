package org.bardales.java.patrones.principiosolid.liskobsubstitution.service;

import org.bardales.java.patrones.principiosolid.liskobsubstitution.domain.CoffeeDrink;
import org.bardales.java.patrones.principiosolid.liskobsubstitution.enums.CoffeeSelection;
import org.bardales.java.patrones.principiosolid.liskobsubstitution.exceptions.CoffeeException;

public interface CoffeeMachine {

    CoffeeDrink brewCoffee(CoffeeSelection selection) throws CoffeeException;

}
