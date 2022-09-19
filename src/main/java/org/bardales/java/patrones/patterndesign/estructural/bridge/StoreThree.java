package org.bardales.java.patrones.patterndesign.estructural.bridge;

public class StoreThree implements IStore {

    @Override
    public String descProduct(String product) {
        System.out.println("Get product detail...");
        return "product for wash the dishes";
    }

    @Override
    public void buyProduct(String name, int amount) {
        System.out.println("Buy " + amount + " of " + name);
    }

    @Override
    public void buyBox(String name, int amountProductsInBox) {
        System.out.println("Buy " + amountProductsInBox + " " + name + " in box");
    }
}
