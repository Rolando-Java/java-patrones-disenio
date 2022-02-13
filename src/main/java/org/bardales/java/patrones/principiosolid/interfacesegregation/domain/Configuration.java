package org.bardales.java.patrones.principiosolid.interfacesegregation.domain;

public class Configuration {

    private int quantityCoffee;
    private int quantityWater;

    public Configuration(int quantityCoffee, int quantityWater) {
        this.quantityCoffee = quantityCoffee;
        this.quantityWater = quantityWater;
    }

    public int getQuantityCoffee() {
        return this.quantityCoffee;
    }

    public int getQuantityWater() {
        return this.quantityWater;
    }

}
