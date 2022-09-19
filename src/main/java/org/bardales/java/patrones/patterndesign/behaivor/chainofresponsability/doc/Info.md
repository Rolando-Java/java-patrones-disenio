# Chain of Responsibility Pattern

Evita acoplar el remitente de una solicitud a su receptor dando a más de un objeto la<br>
oportunidad de manejar la solicitud.<br>
En este patrón, normalmente cada receptor contiene una referencia a otro receptor. En donde el
receptor<br>
decide si lo procesa o si le pasa al siguiente receptor de la cadena de responsabilidad.

Uno de los grandes ejemplos de este patrón es **_máquina dispensadora de cajero automático_**.

![Graph one](img.png)
![Graph two](img2.png)