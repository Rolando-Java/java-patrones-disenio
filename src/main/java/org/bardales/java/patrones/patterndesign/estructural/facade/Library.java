package org.bardales.java.patrones.patterndesign.estructural.facade;

public class Library {

    public void book(String name, Integer cant) {
        System.out.println("Reservando " + cant + " libros de " + name + "...");
    }

}
