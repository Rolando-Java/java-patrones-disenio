package org.bardales.java.patrones.patterndesign.estructural.facade;

import java.util.List;

public class FacadeTest {

    public static void main(String... args) {
        RegistrationFacade registrationFacade = new RegistrationFacade();
        registrationFacade.preRegistration("Estudiante de cuarto año que pase a quinto año");
        registrationFacade.getEnrollmentProposal();
        List<String> courses = List.of("history", "arithmetic", "english", "language");
        List<String> coursesToBuy = List.of(courses.get(0), courses.get(1));
        List<String> coursesToBook = List.of(courses.get(2), courses.get(3));
        registrationFacade.registration(courses);
        registrationFacade.generateBuyBook(coursesToBuy);
        registrationFacade.generateBook(coursesToBook);
    }

}
