package org.bardales.java.patrones.patterndesign.estructural.proxy;

public class ProxyTest {

    public static void main(String... args) {
        Account account = new NewAccount("luck");
        System.out.println("client = " + account.getClient());
        account.transaction(100);
        System.out.println("amount = " + account.getAmount());
        account.transaction(-110);
        System.out.println("amount = " + account.getAmount());
    }

}
