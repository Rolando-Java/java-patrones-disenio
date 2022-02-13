package org.bardales.java.patrones.principiosolid.liskobsubstitution.ejemplo;

import java.util.HashMap;
import java.util.Map;
import org.bardales.java.patrones.principiosolid.liskobsubstitution.domain.CoffeeBean;
import org.bardales.java.patrones.principiosolid.liskobsubstitution.domain.CoffeeDrink;
import org.bardales.java.patrones.principiosolid.liskobsubstitution.domain.GroundCoffee;
import org.bardales.java.patrones.principiosolid.liskobsubstitution.enums.CoffeeSelection;
import org.bardales.java.patrones.principiosolid.liskobsubstitution.exceptions.CoffeeException;
import org.bardales.java.patrones.principiosolid.liskobsubstitution.service.BasicCoffeeMachine;
import org.bardales.java.patrones.principiosolid.liskobsubstitution.service.CoffeeMachine;
import org.bardales.java.patrones.principiosolid.liskobsubstitution.service.PremiumCoffeeMachine;

public class CoffeeApp {

    private CoffeeMachine coffeeMachine;

    public CoffeeApp(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public static void main(String... args) {
       /*
        Si S es un subtipo de T, entonces los objetos de tipo T
        pueden ser sustituidos por objetos de tipo S, sin interrumpir la aplicación.

        Se debe seguir las siguientes reglas:
        -un método anulado de la subclase debe aceptar los mismos valores de parámetros
        de entrada que el método de la superclase.
        -en el método anulado de la subclase se puede aplicar validaciones menos restrictivas,
        pero no más estrictas que la superclase.
        -el valor de retorno del método de la superclase debe cumplir las mismas reglas que el valor
        de retorno del método de la superclase. Solo puede decidir aplicar reglas aún más estrictas
        al devolver una subclase específica del valor de retorno o al devolver un subconjunto de los
        valores de retorno válidos de la superclase.
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
