package org.bardales.java.patrones.patterndesign.estructural.facade;

import java.util.List;

public class RegistrationFacade {

    private Secretary secretary;
    private Curriculum curriculum;
    private BookShop bookShop;
    private Library library;

    public RegistrationFacade() {
        this.secretary = new Secretary();
        this.curriculum = new Curriculum();
        this.bookShop = new BookShop();
        this.library = new Library();
    }

    public void preRegistration(String studentInformation) {
        if (this.curriculum.meetRequirements()) {
            this.secretary.createFile();
            System.out.println("Registrando expediente el alumno...");
        }
    }

    public void getEnrollmentProposal() {
        System.out.println(
                "Propuesta de libros obligatorios : " + this.curriculum.getCompulsorySubjects());
        System.out.println(
                "Propuesta de libros opcionales : " + this.curriculum.getOptionalSubjects());
    }

    public void registration(List<String> courses) {
        System.out.println("Matriculándose en los siguiente cursos...");
    }

    public void generateBuyBook(List<String> coursesToBuy) {
        System.out.println("Comprando los libros...");
        coursesToBuy.forEach(name -> this.bookShop.buyBook(name, 2));
    }

    public void generateBook(List<String> coursesToBook) {
        System.out.println("Reservando los libros...");
        coursesToBook.forEach(name -> this.library.book(name, 2));
    }

}
