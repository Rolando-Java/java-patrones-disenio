package org.bardales.java.patrones.principiosolid.liskobsubstitution.domain;

public class Coffee {

    private String name;
    private double quantity;

    public Coffee(String name, double quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public double getQuantity() {
        return this.quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

}
