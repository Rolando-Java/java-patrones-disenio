package org.bardales.java.patrones.patterndesign.estructural.proxy;

public class NormalAccount implements Account {

    private final String client;
    private int amount;

    public NormalAccount(String client) {
        this.client = client;
        this.amount = 0;
    }

    @Override
    public String getClient() {
        return this.client;
    }

    @Override
    public int getAmount() {
        return this.amount;
    }

    @Override
    public void transaction(int money) {
        this.amount += money;
    }
}
