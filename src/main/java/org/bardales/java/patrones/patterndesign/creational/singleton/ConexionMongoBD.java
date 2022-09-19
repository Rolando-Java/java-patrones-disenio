package org.bardales.java.patrones.patterndesign.creational.singleton;

/*
 Singleton Class in Java using Early Loading.
 La instancia podría ser inicializada durante la declaración de la instancia.
 */
public final class ConexionMongoBD {

    private static final ConexionMongoBD INSTANCE = new ConexionMongoBD();

    private ConexionMongoBD() {}

    public static ConexionMongoBD getInstance() {
        return INSTANCE;
    }

}