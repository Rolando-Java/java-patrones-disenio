package org.bardales.java.patrones.patterndesign.behaivor.command;

/*
 Esta interfaz representa una acción (función) no un objeto. Es por ello, que solo
 se declara un método. Es decir, es una interfaz funcional, las cuales son muy usadas
 en la programación funcional.
 */
@FunctionalInterface
public interface Command {

    void execute();

}
