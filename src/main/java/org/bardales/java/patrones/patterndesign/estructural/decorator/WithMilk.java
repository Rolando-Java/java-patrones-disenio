package org.bardales.java.patrones.patterndesign.estructural.decorator;

public class WithMilk implements Coffee {

    private Coffee coffee;

    public WithMilk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String description() {
        return coffee.description().concat(" with milk");
    }

    @Override
    public int price() {
        return coffee.price() + 20;
    }
}
