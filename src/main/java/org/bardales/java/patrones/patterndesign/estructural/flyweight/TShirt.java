package org.bardales.java.patrones.patterndesign.estructural.flyweight;

public class TShirt {

    byte[] tShirtImage;

    public TShirt(byte[] tShirtImage) {
        this.tShirtImage = tShirtImage;
    }

    @Override
    public String toString() {
        return "TShirtImage" + this.tShirtImage;
    }

}
