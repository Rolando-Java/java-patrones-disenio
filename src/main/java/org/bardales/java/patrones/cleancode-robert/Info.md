#Clean Code Robert C. Martin
##Dry Principle (Don't Repeat Yourself)
Probablemente el mayor enemigo del código limpio es el código duplicado.<br>
El código duplicado hace que nuestro código sea más difícil de mantener y comprender<br>
además de generar posibles inconsistencias. Hay que evitar el código duplicado siempre.<br>
Para ello, dependiendo del caso concreto, la refactorización, la abstracción o el uso de<br>
patrones de diseño.<br>

##Least Surprise
Quiere decir '_Menos sorpresas_'. Nos dice que las funciones o clases deben hacer lo que (razonablemente)<br>
se espera de ellas. Es decir, una función o una clase debe tener, en función de su nombre,<br>
un comportamiento obvio para cualquier programador, sin que tenga la necesidad de sumergirse en el<br>
código.<br>

En el libro vemos el siguiente ejemplo (Day es un enum que representa los días de la semana)
```
Day day = DayDate.stringToDay(String dayName);
```
Cualquier programador al ver esta función (método) esperará que si le pasa la cadena de<br>
caracteres 'Monday', la respuesta sea DAY.MONDAY. Incluso podríamos esperar que diese<br>
igual enviar la cadena en mayúsculas o minúsculas. Si esta función no hiciese esto su<br>
comportamiento no sería obvio y no estaría cumpliendo con el principio.

##The Boy Scout Rule
Quiere decir '_Deja el campamento más limpio de como te lo encontraste_'.<br>
Ampliándola a otros ámbitos sería algo así como: '_deja las cosas mejor de como te las
encontraste_'.<br>
Muchas veces revisando el código, nos encontramos con que el nombre de una variable no es<br>
demasiado intuitivo o con un fragmento de código duplicado. Es mejor resolver este tipo<br>
de matices en vez de mirar hacia otro lado y pasar de largo.

##F.I.R.S.T
Como ya sabemos los test forman un papel fundamental en el arte de escribir código limpio.
Estos deben cumplir con una serie de reglas.
* FAST -> los test deben correr rápido y tardar poco en ejecutarse.
* INDEPENDENT -> los test deben ser independientes unos de otros y deben ejecutarse en cualquier orden.
* REPEATABLE -> los test deben poder ejecutarse en cualquier entorno.
* SELF-VALIDATING -> los test deben devolver una respuesta booleana. Pasan o no pasan.
* TIMELY -> los test deben ser escritos antes que el código de producción.

