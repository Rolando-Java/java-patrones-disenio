package org.bardales.java.patrones.principiosolid.openclosed.domain;

public class GroundCoffee {

    private String name;
    private int quantity;

    public GroundCoffee(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
