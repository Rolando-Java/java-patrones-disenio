package org.bardales.java.patrones.patterndesign.behaivor.visitor;

public class Book implements ItemElement {

    private final int price;
    private final String isbnNumber;

    public Book(int price, String isbnNumber) {
        this.price = price;
        this.isbnNumber = isbnNumber;
    }

    public int getPrice() {
        return this.price;
    }

    public String getIsbnNumber() {
        return this.isbnNumber;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

}
