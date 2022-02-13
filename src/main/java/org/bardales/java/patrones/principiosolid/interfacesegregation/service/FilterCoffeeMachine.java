package org.bardales.java.patrones.principiosolid.interfacesegregation.service;

import org.bardales.java.patrones.principiosolid.interfacesegregation.domain.CoffeeDrink;
import org.bardales.java.patrones.principiosolid.interfacesegregation.enums.CoffeeSelection;
import org.bardales.java.patrones.principiosolid.interfacesegregation.exceptions.CoffeeException;

public interface FilterCoffeeMachine extends CoffeeMachine {

    CoffeeDrink brewFilterCoffee(CoffeeSelection selection) throws CoffeeException;

}
