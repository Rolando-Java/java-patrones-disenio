package org.bardales.java.patrones.patterndesign.behaivor.chainofresponsability;

public class ChainOfResponsibilityTest {

    public static void main(String... args) {
        DispenseChain chain = new Dollar50Dispenser(new Dollar20Dispenser(new Dollar10Dispenser()));

        int amount = 135;
        chain.dispense(new Currency(amount));
    }

}