package org.bardales.java.patrones.patterndesign.estructural.proxy;

public interface Account {
    String getClient();
    int getAmount();
    void transaction(int money);
}
