package org.bardales.java.patrones.patterndesign.creational.factory;

public class CarUSAFactory extends CarFactory {

    @Override
    protected Car createCar() {
        return new CarPilotRight();
    }

}
