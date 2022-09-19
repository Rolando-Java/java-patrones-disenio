package org.bardales.java.patrones.patterndesign.creational.singleton;

/*
 Debido a que cuando se trabaja con hilos o que al instanciar un objeto pesado
 requiera gran esfuerzo, se recomienda usar los enumerables para hacer un singleton.
 Lo único que debe hacer es definir un único elemento en el enumerable, el cual
 representará la única instancia de este enumerable,
 */
enum EnumSingleton {
    INSTANCE;

    public void method() {
        System.out.println("do something");
    }
}

public class SingletonTest {

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

        EnumSingleton enumInstance1 = EnumSingleton.INSTANCE;
        EnumSingleton enumInstance2 = EnumSingleton.INSTANCE;
        assert enumInstance1 == enumInstance2;

        enumInstance1.method();

    }

}