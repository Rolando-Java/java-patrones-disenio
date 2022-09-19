package org.bardales.java.patrones.patterndesign.creational.factory;

public abstract class CarFactory {

    public Car generate() {
        Car car = this.createCar();
        car.putControls();
        car.putWheels();
        car.putChassis();
        return car;
    }

    protected abstract Car createCar();

}
