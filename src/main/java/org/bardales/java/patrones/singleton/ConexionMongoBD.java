package org.bardales.java.patrones.singleton;

/*
 Singleton Class in Java using Early Loading.
 La instancia podría ser inicializada durante la declaración de la instancia.
 */
public class ConexionMongoBD {

    private static final ConexionMongoBD INSTANCE = new ConexionMongoBD();

    private ConexionMongoBD() {}

    public static ConexionMongoBD getInstance() {
        return INSTANCE;
    }

}