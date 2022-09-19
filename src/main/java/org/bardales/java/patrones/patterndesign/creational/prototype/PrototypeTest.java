package org.bardales.java.patrones.patterndesign.creational.prototype;

public class PrototypeTest {

    public static void main(String... args) {
        PdfTable pdfTable = new PdfTable();
        Style style1 = new Style("align center", "align middle", "helvetica", "bold");
        pdfTable.addCell(new Cell("Curso", style1));

        /*
         En vez de llamar al constructor de la clase Style y pasar los mismos valores, tan solo
         por querer cambiar el font, se optó por clonar dicha instancia, aplicando el patrón prototype.
         */
        Style style2 = style1.clone();
        style2.setFont("normal");
        pdfTable.addCell(new Cell("Profesor", style2));
        pdfTable.generatePdf();
    }

}
