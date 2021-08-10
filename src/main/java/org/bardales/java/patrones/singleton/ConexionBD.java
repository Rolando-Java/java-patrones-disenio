package org.bardales.java.patrones.singleton;

import java.util.Objects;

public class ConexionBD {

    private static ConexionBD instancia;

    private ConexionBD() {
        System.out.println("instanciando...");
    }

    public static ConexionBD getInstancia() {
        if(Objects.isNull(ConexionBD.instancia)) ConexionBD.instancia = new ConexionBD();
        return ConexionBD.instancia;
    }

}
