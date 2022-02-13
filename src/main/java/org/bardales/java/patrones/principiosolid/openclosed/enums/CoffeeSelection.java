package org.bardales.java.patrones.principiosolid.openclosed.enums;

public enum CoffeeSelection {

    FILTER_COFFEE("filter coffee"), ESPRESSO_COFFEE("espresso coffee");

    private final String nom;

    CoffeeSelection(String nom) {
        this.nom = nom;
    }

    public String getName() {
        return this.nom;
    }

    @Override
    public String toString() {
        return this.nom;
    }

}
