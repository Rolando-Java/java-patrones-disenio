package org.bardales.java.patrones.patterndesign.creational.abstractfactory;

public class FactoryNoSQL implements AbstractFactory {

    @Override
    public RepositoryStudents createRepositoryStudents() {
        return new RepositoryStudentsNoSQL();
    }

    @Override
    public RepositoryCourses createRepositoryCourses() {
        return new RepositoryCoursesNoSQL();
    }
}
