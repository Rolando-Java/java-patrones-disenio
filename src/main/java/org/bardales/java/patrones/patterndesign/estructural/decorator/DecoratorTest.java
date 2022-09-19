package org.bardales.java.patrones.patterndesign.estructural.decorator;

public class DecoratorTest {

    public static void main(String... args) {
        Coffee coffee = new WithMilk(new CoffeeShort());
        System.out.println("description : " + coffee.description());
        System.out.println("price : " + coffee.price());
    }

}