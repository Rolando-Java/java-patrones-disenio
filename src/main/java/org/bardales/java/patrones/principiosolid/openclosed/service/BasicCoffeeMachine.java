package org.bardales.java.patrones.principiosolid.openclosed.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.bardales.java.patrones.principiosolid.openclosed.bussiness.BrewingUnit;
import org.bardales.java.patrones.principiosolid.openclosed.domain.CoffeeDrink;
import org.bardales.java.patrones.principiosolid.openclosed.domain.Configuration;
import org.bardales.java.patrones.principiosolid.openclosed.domain.GroundCoffee;
import org.bardales.java.patrones.principiosolid.openclosed.enums.CoffeeSelection;
import org.bardales.java.patrones.principiosolid.openclosed.exceptions.CoffeeException;

public class BasicCoffeeMachine implements CoffeeMachine {

    private Map<CoffeeSelection, Configuration> configMap;
    private Map<CoffeeSelection, GroundCoffee> beans;
    private BrewingUnit brewingUnit;

    public BasicCoffeeMachine(Map<CoffeeSelection, GroundCoffee> beans) {
        this.beans = beans;
        this.brewingUnit = new BrewingUnit();
        this.configMap = new HashMap<>(
                Map.of(CoffeeSelection.FILTER_COFFEE, new Configuration(30, 480))
        );

    }

    @Override
    public CoffeeDrink brewCoffee(CoffeeSelection selection) throws CoffeeException {

        if (!CoffeeSelection.FILTER_COFFEE.equals(selection)) {
            throw new CoffeeException("CoffeeSelection [" + selection + "] not supported!");
        }
        Configuration configuration = configMap.get(selection);

        GroundCoffee groundCoffee = this.beans.get(selection);

        return this.brewingUnit.brew(selection, groundCoffee,
                configuration.getQuantityWater());
    }

    public void addCoffeeBeans(CoffeeSelection coffeeSelection, GroundCoffee newCoffee)
            throws CoffeeException {
        GroundCoffee existingCoffee = this.beans.get(CoffeeSelection.FILTER_COFFEE);

        if (Objects.nonNull(existingCoffee)) {
            if (existingCoffee.getName().equals(newCoffee.getName())) {
                existingCoffee.setQuantity(existingCoffee.getQuantity() + newCoffee.getQuantity());
            } else {
                throw new CoffeeException(
                        "Only one kind of coffee supported for each CoffeeSelection.");
            }
        } else {
            this.beans.put(coffeeSelection, newCoffee);
        }
    }

}
