package org.bardales.java.patrones.patterndesign.creational.abstractfactory;

import java.util.List;

public class RepositoryCoursesNoSQL implements RepositoryCourses {

    @Override
    public List<String> listCourses() {
        return List.of("Curso no relacional");
    }
}
