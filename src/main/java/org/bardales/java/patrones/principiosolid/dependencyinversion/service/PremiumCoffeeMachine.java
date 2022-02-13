package org.bardales.java.patrones.principiosolid.dependencyinversion.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.bardales.java.patrones.principiosolid.dependencyinversion.bussiness.BrewingUnit;
import org.bardales.java.patrones.principiosolid.dependencyinversion.bussiness.Grinder;
import org.bardales.java.patrones.principiosolid.dependencyinversion.domain.CoffeeBean;
import org.bardales.java.patrones.principiosolid.dependencyinversion.domain.CoffeeDrink;
import org.bardales.java.patrones.principiosolid.dependencyinversion.domain.Configuration;
import org.bardales.java.patrones.principiosolid.dependencyinversion.domain.GroundCoffee;
import org.bardales.java.patrones.principiosolid.dependencyinversion.enums.CoffeeSelection;
import org.bardales.java.patrones.principiosolid.dependencyinversion.exceptions.CoffeeException;

public class PremiumCoffeeMachine implements EspressoCoffeeMachine, FilterCoffeeMachine {

    private Map<CoffeeSelection, Configuration> configMap;
    private Map<CoffeeSelection, CoffeeBean> beans;
    private Grinder grinder;
    private BrewingUnit brewingUnit;

    public PremiumCoffeeMachine(Map<CoffeeSelection, CoffeeBean> coffee) {
        this.beans = coffee;
        this.brewingUnit = new BrewingUnit();
        this.grinder = new Grinder();

        this.configMap = new HashMap<>();
        this.configMap = new HashMap<>(
                Map.of(CoffeeSelection.FILTER_COFFEE, new Configuration(30, 480),
                        CoffeeSelection.ESPRESSO, new Configuration(8, 28)
                ));
    }

    @Override
    public CoffeeDrink brewCoffee(CoffeeSelection selection) throws CoffeeException {
        return switch (selection) {
            case FILTER_COFFEE -> this.brewFilterCoffee(selection);
            case ESPRESSO -> this.brewEspresso(selection);
            default -> throw new CoffeeException(
                    "CoffeeSelection [" + selection + "] not supported!");
        };
    }

    @Override
    public CoffeeDrink brewEspresso(CoffeeSelection selection) {
        Configuration config = this.configMap.get(selection);

        GroundCoffee groundCoffee = this.grinder.grind(this.beans.get(selection),
                config.getQuantityCoffee());

        return this.brewingUnit.brew(selection, groundCoffee, config.getQuantityWater());
    }

    @Override
    public CoffeeDrink brewFilterCoffee(CoffeeSelection selection) {
        Configuration config = this.configMap.get(selection);

        GroundCoffee groundCoffee = this.grinder.grind(this.beans.get(selection),
                config.getQuantityCoffee());

        return this.brewingUnit.brew(selection, groundCoffee, config.getQuantityWater());
    }

    public void addCoffee(CoffeeSelection selection, CoffeeBean newCoffee)
            throws CoffeeException {
        CoffeeBean existingBeans = this.beans.get(selection);

        if (Objects.nonNull(existingBeans)) {
            if (existingBeans.getName().equals(newCoffee.getName())) {
                existingBeans.setQuantity(existingBeans.getQuantity() + newCoffee.getQuantity());
            } else {
                throw new CoffeeException(
                        "Only one kind of coffee supported for each CoffeeSelection.");
            }
        } else {
            this.beans.put(selection, newCoffee);
        }
    }

}
