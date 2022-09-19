package org.bardales.java.patrones.patterndesign.estructural.facade;

public class BookShop {

    public void buyBook(String name, Integer cant) {
        System.out.println("Comprando " + cant + " libros de " + name + "...");
    }

}
