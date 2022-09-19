package org.bardales.java.patrones.patterndesign.creational.abstractfactory;

public class FactorySQL implements AbstractFactory {

   @Override
   public RepositoryStudents createRepositoryStudents() {
      return new RepositoryStudentsSQL();
   }

   @Override
   public RepositoryCourses createRepositoryCourses() {
      return new RepositoryCoursesSQL();
   }
}
