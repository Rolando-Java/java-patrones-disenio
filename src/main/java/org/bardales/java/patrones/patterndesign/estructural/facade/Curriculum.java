package org.bardales.java.patrones.patterndesign.estructural.facade;

import java.util.List;

public class Curriculum {

    public boolean meetRequirements() {
        return true;
    }

    public List<String> getCompulsorySubjects() {
       return List.of("history", "arithmetic", "geography");
    }

    public List<String> getOptionalSubjects() {
       return List.of("english", "language");
    }

}
