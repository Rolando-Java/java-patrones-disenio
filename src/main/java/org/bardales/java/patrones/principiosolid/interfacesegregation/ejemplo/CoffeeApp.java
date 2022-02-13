package org.bardales.java.patrones.principiosolid.interfacesegregation.ejemplo;

import java.util.HashMap;
import java.util.Map;
import org.bardales.java.patrones.principiosolid.interfacesegregation.domain.CoffeeBean;
import org.bardales.java.patrones.principiosolid.interfacesegregation.domain.CoffeeDrink;
import org.bardales.java.patrones.principiosolid.interfacesegregation.enums.CoffeeSelection;
import org.bardales.java.patrones.principiosolid.interfacesegregation.exceptions.CoffeeException;
import org.bardales.java.patrones.principiosolid.interfacesegregation.service.CoffeeMachine;
import org.bardales.java.patrones.principiosolid.interfacesegregation.service.PremiumCoffeeMachine;

public class CoffeeApp {

    private CoffeeMachine coffeeMachine;

    public CoffeeApp(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public static void main(String... args) {
        /*
         Los clientes no deben estar obligados a depender de interfaces que no utilizan.
         */

        Map<CoffeeSelection, CoffeeBean> beans = new HashMap<>();
        beans.put(CoffeeSelection.FILTER_COFFEE, new CoffeeBean("Moka", 1000));
        beans.put(CoffeeSelection.ESPRESSO, new CoffeeBean("Java", 5000));

        PremiumCoffeeMachine machine = new PremiumCoffeeMachine(beans);

        CoffeeApp coffeeApp = new CoffeeApp(machine);

        try {
            coffeeApp.prepareCoffee(CoffeeSelection.ESPRESSO);
        } catch (CoffeeException e) {
            e.printStackTrace();
        }

    }

    public CoffeeDrink prepareCoffee(CoffeeSelection selection) throws CoffeeException {
        CoffeeDrink coffee = this.coffeeMachine.brewCoffee(selection);
        System.out.println("Coffee is ready!");
        return coffee;
    }


}
