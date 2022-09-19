package org.bardales.java.patrones.patterndesign.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class PdfTable {

    private List<Cell> cells;

    public PdfTable() {
        this.cells = new ArrayList<>();
    }

    public void addCell(Cell cell) {
        this.cells.add(cell);
    }

    public void generatePdf() {
        this.cells.forEach(cell -> {
            System.out.println("Generando celda con valor : " + cell.getValue() + " con estilo : "
                    + cell.getStyle());
        });
    }

}
