package org.bardales.java.patrones.patterndesign.behaivor.visitor;

public interface ShoppingCartVisitor {

    int visit(Book book);
    int visit(Fruit fruit);

}
