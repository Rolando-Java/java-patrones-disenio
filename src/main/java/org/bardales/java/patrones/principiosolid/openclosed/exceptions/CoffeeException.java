package org.bardales.java.patrones.principiosolid.openclosed.exceptions;

import java.io.Serial;

public class CoffeeException extends Exception {

    @Serial
    private static final long serialVersionUID = 1L;

    public CoffeeException(String message) {
        super(message);
    }

}
