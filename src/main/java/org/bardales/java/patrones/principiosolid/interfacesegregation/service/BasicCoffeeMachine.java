package org.bardales.java.patrones.principiosolid.interfacesegregation.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.bardales.java.patrones.principiosolid.interfacesegregation.bussiness.BrewingUnit;
import org.bardales.java.patrones.principiosolid.interfacesegregation.domain.CoffeeDrink;
import org.bardales.java.patrones.principiosolid.interfacesegregation.domain.Configuration;
import org.bardales.java.patrones.principiosolid.interfacesegregation.domain.GroundCoffee;
import org.bardales.java.patrones.principiosolid.interfacesegregation.enums.CoffeeSelection;
import org.bardales.java.patrones.principiosolid.interfacesegregation.exceptions.CoffeeException;

public class BasicCoffeeMachine implements FilterCoffeeMachine {

    private Map<CoffeeSelection, Configuration> configMap;
    private Map<CoffeeSelection, GroundCoffee> groundCoffeeMap;
    private BrewingUnit brewingUnit;

    public BasicCoffeeMachine(Map<CoffeeSelection, GroundCoffee> coffee) {
        this.groundCoffeeMap = coffee;
        this.brewingUnit = new BrewingUnit();

        this.configMap = new HashMap<>();
        this.configMap = new HashMap<>(
                Map.of(CoffeeSelection.FILTER_COFFEE, new Configuration(30, 480)));
    }

    @Override
    public CoffeeDrink brewCoffee(CoffeeSelection selection) throws CoffeeException {
        return switch (selection) {
            case FILTER_COFFEE -> this.brewFilterCoffee(selection);
            default -> throw new CoffeeException(
                    "CoffeeSelection [" + selection + "] not supported!");
        };
    }

    @Override
    public CoffeeDrink brewFilterCoffee(CoffeeSelection selection) {
        Configuration config = this.configMap.get(selection);

        GroundCoffee groundCoffee = this.groundCoffeeMap.get(selection);

        return this.brewingUnit.brew(selection, groundCoffee, config.getQuantityWater());
    }

    public void addCoffee(CoffeeSelection selection, GroundCoffee newCoffee)
            throws CoffeeException {
        GroundCoffee existingCoffee = this.groundCoffeeMap.get(selection);

        if (Objects.nonNull(existingCoffee)) {
            if (existingCoffee.getName().equals(newCoffee.getName())) {
                existingCoffee.setQuantity(existingCoffee.getQuantity() + newCoffee.getQuantity());
            } else {
                throw new CoffeeException(
                        "Only one kind of coffee supported for each CoffeeSelection.");
            }
        } else {
            this.groundCoffeeMap.put(selection, newCoffee);
        }
    }

}
