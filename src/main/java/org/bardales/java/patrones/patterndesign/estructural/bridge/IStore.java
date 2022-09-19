package org.bardales.java.patrones.patterndesign.estructural.bridge;

public interface IStore {

    String descProduct(String product);

    void buyProduct(String name, int amount);

    void buyBox(String name, int amountProductsInBox);

}
