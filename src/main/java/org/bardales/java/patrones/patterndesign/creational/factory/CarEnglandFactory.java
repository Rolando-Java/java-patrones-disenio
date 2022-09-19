package org.bardales.java.patrones.patterndesign.creational.factory;

public class CarEnglandFactory extends CarFactory {

    @Override
    protected Car createCar() {
        return new CarPilotLeft();
    }

}
