package org.bardales.java.patrones.patterndesign.creational.factory;

public class FactoryTest {

    public static void main(String... args) {
        CarFactory carFactory = new CarEnglandFactory();
        Car carEngland = carFactory.generate();
        System.out.println("carEngland = " + carEngland);
        carFactory = new CarUSAFactory();
        Car carUSA = carFactory.generate();
        System.out.println("carUSA = " + carUSA);
    }

}
