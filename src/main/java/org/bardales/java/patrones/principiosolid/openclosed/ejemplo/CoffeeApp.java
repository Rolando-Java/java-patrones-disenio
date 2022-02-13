package org.bardales.java.patrones.principiosolid.openclosed.ejemplo;

import java.util.HashMap;
import java.util.Map;
import org.bardales.java.patrones.principiosolid.openclosed.domain.GroundCoffee;
import org.bardales.java.patrones.principiosolid.openclosed.domain.CoffeeDrink;
import org.bardales.java.patrones.principiosolid.openclosed.exceptions.CoffeeException;
import org.bardales.java.patrones.principiosolid.openclosed.enums.CoffeeSelection;
import org.bardales.java.patrones.principiosolid.openclosed.service.CoffeeMachine;
import org.bardales.java.patrones.principiosolid.openclosed.service.PremiumCoffeeMachine;

public class CoffeeApp {

    private CoffeeMachine coffeeMachine;

    public CoffeeApp(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public static void main(String... args) {

       /*
        Las entidades deben estar abiertas a extension, pero
        cerradas a modificación

        Promueve el uso de interfaces para permitirle adaptar la funcionalidad de su aplicación sin cambiar el código existente.

        Una clase está cerrada, ya que puede compilarse, almacenarse en una biblioteca, establecer una línea de base
        y ser utilizada por clases de clientes. Pero también es abierto, ya que cualquier clase nueva puede usarlo
        como padre, agregando nuevas funciones. Cuando se define una clase descendiente, no hay necesidad de cambiar
        el original o de molestar a sus clientes.
        */

        Map<CoffeeSelection, GroundCoffee> beans = new HashMap<>();
        beans.put(CoffeeSelection.FILTER_COFFEE, new GroundCoffee("Moka", 1000));
        beans.put(CoffeeSelection.ESPRESSO_COFFEE, new GroundCoffee("Java", 1000));

        PremiumCoffeeMachine machine = new PremiumCoffeeMachine(beans);

        CoffeeApp app = new CoffeeApp(machine);
        try {
            app.prepareCoffee(CoffeeSelection.ESPRESSO_COFFEE);
        } catch (CoffeeException e) {
            e.printStackTrace();
        }

    }

    public CoffeeDrink prepareCoffee(CoffeeSelection coffeeSelection) throws CoffeeException {
        CoffeeDrink coffee = this.coffeeMachine.brewCoffee(coffeeSelection);
        System.out.println("Coffee is ready!");
        return coffee;
    }

}
