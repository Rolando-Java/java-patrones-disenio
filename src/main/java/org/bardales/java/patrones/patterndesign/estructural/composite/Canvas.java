package org.bardales.java.patrones.patterndesign.estructural.composite;

public class Canvas {

    private Figure figure;

    public Canvas(Figure figure) {
        this.figure = figure;
    }

    public void generate() {
        this.paintPicture(figure);
    }

    private void paintPicture(Figure figure) {
       figure.paint();
       figure.getFiguras().forEach(this::paintPicture);
    }

}
