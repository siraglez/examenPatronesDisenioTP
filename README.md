link al repositorio: https://github.com/siraglez/examenPatronesDisenioTP.git

# Ejercicio 1

## Clase abstracta (`Elemento`):

- Clase abstracta que sirve como clase base para todos los elementos de mobiliario. Tiene dos atributos protegidos: `precio`para almacenar el precio del elemento y `código`para almacenar un identificador único para cada elemento.
- El constructor inicializa los atributos `precio`y `código`.
- La clase tiene dos métodos públicos `getCodigo()`y `getPrecio()`, para obtener el precio y código de los elementos respectivamente.
- La clase además declara un método abstracto `calcularPrecio()`que debe ser implementado por las subclases. Este método calcula y devuelve el precio del elemento.

## Clase (`ElementoSimple`):

- Esta clase extiende la clase `Elemento`y representa un elemento simple de mobiliario.
- Su cosntructor llama al constructor de la clase base para inicializar el precio y el código del elemento.
- Implementa el método abstracto `calcularPrecio()`que únicamente devuelve el precio del elemento.

## Clase (`Kit`):

- Esta clase extienede de la clase `Elemento`y representa un kit, que es un grupo de elementos de mobiliario, por lo que es compuesta.
- Tiene un atributo `elementos` que es una lista de elementos que componen el kit.
- Su constructor llama al constructor de la clase base para inicializar el código del kit con el valor proporcionado (el precio se establece en 0 ya que se calculará dinámicamente más adelante).
- Implementa el método `calcularPrecio()` que calcula el precio total del kit, sumando los precios de todos los elementos que contiene y aplicando además el descuento del 10% correspondiente a los kits.

## Clase (`Main`):
