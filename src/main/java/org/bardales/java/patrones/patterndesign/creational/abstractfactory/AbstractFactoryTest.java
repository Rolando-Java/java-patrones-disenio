package org.bardales.java.patrones.patterndesign.creational.abstractfactory;

import java.util.List;

public class AbstractFactoryTest {

    public static void main(String... args) {
        AbstractFactory abstractFactory = new FactorySQL();
        RepositoryCourses repositoryCourses = abstractFactory.createRepositoryCourses();
        List<String> courses = repositoryCourses.listCourses();
        System.out.println("courses = " + courses);

        RepositoryStudents repositoryStudents = abstractFactory.createRepositoryStudents();
        List<String> students = repositoryStudents.listStudents();
        System.out.println("students = " + students);
    }

}
