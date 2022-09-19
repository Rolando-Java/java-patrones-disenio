package org.bardales.java.patrones.patterndesign.creational.prototype;

public class Cell {

    private String value;
    private Style style;

    public Cell(String value, Style style) {
        this.value = value;
        this.style = style;
    }

    public String getValue() {
        return this.value;
    }

    public Style getStyle() {
        return this.style;
    }

    @Override
    public String toString() {
        return "value : " + this.value + " style : " + this.style;
    }

}
