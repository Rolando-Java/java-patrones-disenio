package org.bardales.java.patrones.patterndesign.estructural.proxy;

public class NewAccount implements Account {

    private Account originalAccount;

    public NewAccount(String client) {
        this.originalAccount = new NormalAccount(client);
    }

    @Override
    public String getClient() {
        return this.originalAccount.getClient();
    }

    @Override
    public int getAmount() {
        return this.originalAccount.getAmount();
    }

    @Override
    public void transaction(int money) {
        if (this.originalAccount.getAmount() + money >= 0) {
            this.originalAccount.transaction(money);
        }
    }
}
