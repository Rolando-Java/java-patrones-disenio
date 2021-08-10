package org.bardales.java.patrones.singleton;

import org.bardales.java.patrones.singleton.ConexionBD;

public class SingletonEjemplo {

    public static void main(String... args) {

        ConexionBD conexionBD = ConexionBD.getInstancia();
        ConexionBD conexionBDDos = ConexionBD.getInstancia();

        boolean bool = (conexionBD == conexionBDDos);
        System.out.println("bool = " + bool);//true

        System.out.println("conexionBD = " + conexionBD);//org.bardales.java.patrones.singleton.ConexionBD@5b480cf9
        System.out.println("conexionBDDos = " + conexionBDDos);//org.bardales.java.patrones.singleton.ConexionBD@5b480cf9

    }

}
