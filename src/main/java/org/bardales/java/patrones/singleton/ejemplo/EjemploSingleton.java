package org.bardales.java.patrones.singleton.ejemplo;

import org.bardales.java.patrones.singleton.ConexionMongoBD;
import org.bardales.java.patrones.singleton.ConexionRedisBD;

public class EjemploSingleton {

    public static void main(String... args) {

        ConexionMongoBD conexionMongoBD = ConexionMongoBD.getInstance();
        System.out.println("conexionMongoBD = " + conexionMongoBD);
        ConexionMongoBD conexionMongoBD2 = ConexionMongoBD.getInstance();
        System.out.println("conexionMongoBD2 = " + conexionMongoBD2);

        assert conexionMongoBD == conexionMongoBD2; // true

        ConexionRedisBD conexionRedisBD = ConexionRedisBD.getInstance();
        System.out.println("conexionRedisBD = " + conexionRedisBD);
        ConexionRedisBD conexionRedisBD2 = ConexionRedisBD.getInstance();
        System.out.println("conexionRedisBD2 = " + conexionRedisBD2);

        assert conexionRedisBD == conexionRedisBD2;

    }

}
