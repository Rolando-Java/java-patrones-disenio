package org.bardales.java.patrones.patterndesign.estructural.bridge;

public class SellParticularImpl implements SellOnlineParticular {

    private IStore store;

    public SellParticularImpl(IStore store) {
        this.store = store;
    }

    @Override
    public String descProduct(String product) {
        return this.store.descProduct(product);
    }

    @Override
    public void buyProduct(String name, int amount) {
        this.store.buyProduct(name, amount);
    }
}
