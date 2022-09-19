package org.bardales.java.patrones.patterndesign.estructural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Figure {

    private List<Figure> figures;

    public Figure() {
        this.figures = new ArrayList<>();
    }

    public void add(Figure figure) {
        this.figures.add(figure);
    }

    public List<Figure> getFiguras() {
        return this.figures;
    }

    protected abstract void paint();

}
