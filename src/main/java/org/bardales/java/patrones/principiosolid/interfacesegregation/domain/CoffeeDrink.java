package org.bardales.java.patrones.principiosolid.interfacesegregation.domain;

import org.bardales.java.patrones.principiosolid.interfacesegregation.enums.CoffeeSelection;
import org.bardales.java.patrones.principiosolid.interfacesegregation.exceptions.CoffeeException;

public class CoffeeDrink {

    private CoffeeSelection selection;
    private double quantity;

    public CoffeeDrink(CoffeeSelection selection, double quantity) {
        this.selection = selection;
        this.quantity = quantity;
    }

    public CoffeeSelection getSelection() {
        return this.selection;
    }

    public double getQuantity() {
        return this.quantity;
    }

    public void setQuantity(double quantity) throws CoffeeException {
        if (quantity >= 0.0) {
            this.quantity = quantity;
        } else {
            throw new CoffeeException("Quantity has to be >= 0.0");
        }
    }

}
