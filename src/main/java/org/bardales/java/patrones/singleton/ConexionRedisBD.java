package org.bardales.java.patrones.singleton;

import java.util.Objects;

/*
 Singleton Class in Java using Early Loading.
 La instancia podría ser inicializada solo cuando la clase Singleton es usada.
 Haciendo crear la instancia de la clase Singleton durante la ejecución del método,
 la cual da acceso a la instancia por primera vez.
 */
public class ConexionRedisBD {

    private static ConexionRedisBD conexionRedisBD;

   private ConexionRedisBD()  {}

   public static ConexionRedisBD getInstance() {
      if(Objects.isNull(conexionRedisBD)) conexionRedisBD = new ConexionRedisBD();
      return conexionRedisBD;
   }

}
