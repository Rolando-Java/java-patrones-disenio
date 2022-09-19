package org.bardales.java.patrones.patterndesign.estructural.composite;

public class CompositeTest {

    public static void main(String... args) {
        Square squareMain = new Square();
        Selection selection1 = new Selection();
        selection1.add(new Square());
        selection1.add(new Square());
        squareMain.add(selection1);

        selection1.getFiguras().get(0).add(new Square());

        Canvas canvas = new Canvas(squareMain);
        canvas.generate();
    }

}
