package org.bardales.java.patrones.patterndesign.creational.prototype;

public class Style implements Cloneable {

    private String alignVertical;
    private String alignHorizontal;
    private String fontFamily;
    private String font;

    public Style(String alignVertical, String alignHorizontal, String fontFamily, String font) {
        this.alignVertical = alignVertical;
        this.alignHorizontal = alignHorizontal;
        this.fontFamily = fontFamily;
        this.font = font;
    }

    public void setAlignVertical(String alignVertical) {
        this.alignVertical = alignVertical;
    }

    public void setAlignHorizontal(String alignHorizontal) {
        this.alignHorizontal = alignHorizontal;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public void setFont(String font) {
        this.font = font;
    }

    @Override
    public String toString() {
        return "alignVertical : " + this.alignVertical + " alignHorizontal : "
                + this.alignHorizontal + " fontFamily : " + this.fontFamily + " font : "
                + this.font;
    }

    @Override
    public Style clone() {
        Style styleClone = null;
        try {
            styleClone = (Style) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return styleClone;
    }

}