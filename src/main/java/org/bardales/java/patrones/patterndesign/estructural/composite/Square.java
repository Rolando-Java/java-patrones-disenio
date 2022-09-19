package org.bardales.java.patrones.patterndesign.estructural.composite;

public class Square extends Figure {

    @Override
    public void add(Figure figure) {
        if(this.getFiguras().isEmpty()) {
            super.add(figure);
        }
    }

    @Override
    public void paint() {
        System.out.println("paint square");
    }

}
