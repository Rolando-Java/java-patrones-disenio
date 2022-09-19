package org.bardales.java.patrones.patterndesign.creational.abstractfactory;

import java.util.List;

public class RepositoryStudentsSQL implements RepositoryStudents {

    @Override
    public List<String> listStudents() {
        return List.of("Alumno relacional");
    }
}
