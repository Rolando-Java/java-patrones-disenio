package org.bardales.java.patrones.principiosolid.openclosed.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.bardales.java.patrones.principiosolid.openclosed.bussiness.BrewingUnit;
import org.bardales.java.patrones.principiosolid.openclosed.bussiness.Grinder;
import org.bardales.java.patrones.principiosolid.openclosed.domain.CoffeeDrink;
import org.bardales.java.patrones.principiosolid.openclosed.domain.Configuration;
import org.bardales.java.patrones.principiosolid.openclosed.domain.GroundCoffee;
import org.bardales.java.patrones.principiosolid.openclosed.enums.CoffeeSelection;
import org.bardales.java.patrones.principiosolid.openclosed.exceptions.CoffeeException;

public class PremiumCoffeeMachine implements CoffeeMachine {

    private Map<CoffeeSelection, Configuration> configMap;
    private Map<CoffeeSelection, GroundCoffee> beans;
    private Grinder grinder;
    private BrewingUnit brewingUnit;

    public PremiumCoffeeMachine(Map<CoffeeSelection, GroundCoffee> beans) {
        this.beans = beans;
        this.grinder = new Grinder();
        this.brewingUnit = new BrewingUnit();

        this.configMap = new HashMap<>(Map.of(
                CoffeeSelection.FILTER_COFFEE, new Configuration(30, 480),
                CoffeeSelection.ESPRESSO_COFFEE, new Configuration(8, 28)
        ));
    }

    @Override
    public CoffeeDrink brewCoffee(CoffeeSelection selection) throws CoffeeException {
        return switch (selection) {
            case FILTER_COFFEE -> this.brewFilterCoffee(selection);
            case ESPRESSO_COFFEE -> this.brewEspresso(selection);
            default -> throw new CoffeeException(
                    "CoffeeSelection [" + selection + "] not supported!");
        };
    }

    private CoffeeDrink brewEspresso(CoffeeSelection selection) {
        Configuration configuration = this.configMap.get(selection);

        GroundCoffee groundCoffee = this.beans.get(selection);
        groundCoffee = this.grinder.grind(groundCoffee, configuration.getQuantityCoffee());

        return this.brewingUnit.brew(selection, groundCoffee, configuration.getQuantityWater());
    }

    private CoffeeDrink brewFilterCoffee(CoffeeSelection selection) {
        Configuration configuration = this.configMap.get(selection);

        GroundCoffee groundCoffee = this.beans.get(selection);
        groundCoffee = this.grinder.grind(groundCoffee, configuration.getQuantityCoffee());

        return this.brewingUnit.brew(selection, groundCoffee, configuration.getQuantityWater());
    }

    public void addCoffeeBeans(CoffeeSelection coffeeSelection, GroundCoffee newCoffee)
            throws CoffeeException {
        GroundCoffee existingCoffee = this.beans.get(CoffeeSelection.FILTER_COFFEE);

        if (Objects.nonNull(existingCoffee)) {
            if (existingCoffee.getName().equals(newCoffee.getName())) {
                existingCoffee.setQuantity(newCoffee.getQuantity());
            } else {
                throw new CoffeeException(
                        "Only one kind of coffee supported for each CoffeeSelection.");
            }
        } else {
            this.beans.put(coffeeSelection, newCoffee);
        }
    }

}
