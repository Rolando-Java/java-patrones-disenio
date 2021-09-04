package org.bardales.java.patrones.builder.ejemplo;

import org.bardales.java.patrones.builder.User;

public class EjemploBuilder {

    public static void main(String... args) {
        //Creando usuarios
        User usuarioUno = User.builder("Jony", "Perez").build();
        User usuarioDos = User.builder("Miguel", "Alonso")
                .withAge(14).withAddress("Las Praderas")
                .build();

        System.out.println("Edad del usuarioDos: " + usuarioDos.getAge());
        System.out.println("usuarioUno: " + usuarioUno);
        System.out.println("usuarioDos: " + usuarioDos);

    }

}