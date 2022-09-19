package org.bardales.java.patrones.patterndesign.behaivor.visitor;

public class VisitorTest {

    public static void main(String... args) {
        ItemElement[] itemElements = new ItemElement[]{
                new Book(20, "1234"),
                new Fruit(30, 2, "Banana")
        };
        int total = 0;
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        for(ItemElement element : itemElements) {
            total += element.accept(visitor);
        }
        System.out.println("Total cost is : " + total);

    }

}
