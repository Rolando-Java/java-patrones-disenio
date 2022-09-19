package org.bardales.java.patrones.patterndesign.estructural.decorator;

public class CoffeeShort implements Coffee {

    @Override
    public String description() {
        return "coffee short";
    }

    @Override
    public int price() {
        return 90;
    }
}
