package org.bardales.java.patrones.principiosolid.dependencyinversion.exceptions;

import java.io.Serial;

public class CoffeeException extends Exception {

    @Serial
    private static final long serialVersionUID = 1L;

    public CoffeeException(String message) {
        super(message);
    }

    public CoffeeException(Throwable cause) {
        super(cause);
    }

    public CoffeeException(String message, Throwable cause) {
        super(message, cause);
    }

}
