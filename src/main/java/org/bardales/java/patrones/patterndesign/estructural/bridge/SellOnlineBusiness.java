package org.bardales.java.patrones.patterndesign.estructural.bridge;

public interface SellOnlineBusiness extends SellOnline {

    void buyProduct(String name, int amountByBox, int countBox);

}
