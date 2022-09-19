package org.bardales.java.patrones.patterndesign.behaivor.chainofresponsability;

public class Dollar10Dispenser implements DispenseChain {

    @Override
    public void dispense(Currency currency) {
        int num = currency.getAmount() / 10;
        int remainder = currency.getAmount() % 10;
        System.out.println("Dispensing " + num + " 10$ note");
        if (remainder != 0) {
            System.out.println(remainder + " cents left");
        }
    }

}
