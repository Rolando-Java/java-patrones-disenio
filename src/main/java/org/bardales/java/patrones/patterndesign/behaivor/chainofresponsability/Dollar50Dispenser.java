package org.bardales.java.patrones.patterndesign.behaivor.chainofresponsability;

public class Dollar50Dispenser implements DispenseChain {

    private DispenseChain chain;

    public Dollar50Dispenser(DispenseChain nextChain) {
       this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 50) {
            int num = currency.getAmount() / 50;
            int remainder = currency.getAmount() % 50;
            System.out.println("Dispensing " + num + " 50$ note");
            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(currency);
        }
    }

}
