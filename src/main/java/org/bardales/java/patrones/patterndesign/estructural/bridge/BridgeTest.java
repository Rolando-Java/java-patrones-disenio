package org.bardales.java.patrones.patterndesign.estructural.bridge;

public class BridgeTest {

    public static void main(String... args) {
        SellOnlineParticular sellOnlineParticular = new SellParticularImpl(new StoreOne());
        sellOnlineParticular.descProduct("knife");
        sellOnlineParticular.buyProduct("Knife", 10);

        SellOnlineBusiness sellOnlineBusiness = new SellBusinessImpl(new StoreTwo());
        sellOnlineBusiness.descProduct("dishwasher");
        sellOnlineBusiness.buyProduct("dishwasher", 20, 5);
    }

}
