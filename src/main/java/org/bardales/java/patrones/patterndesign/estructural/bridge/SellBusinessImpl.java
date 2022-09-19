package org.bardales.java.patrones.patterndesign.estructural.bridge;

public class SellBusinessImpl implements SellOnlineBusiness {

    private IStore store;

    public SellBusinessImpl(IStore store) {
        this.store = store;
    }

    @Override
    public String descProduct(String product) {
        return this.store.descProduct(product);
    }

    @Override
    public void buyProduct(String name, int amountByBox, int countBox) {
        this.store.buyProduct(name, amountByBox);
        for (int i = 0; i < countBox; i++) {
           this.store.buyBox(name, amountByBox);
        }
    }

}
